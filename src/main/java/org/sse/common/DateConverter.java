package org.sse.common;


import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;



@Configuration
public class DateConverter implements Converter<String, Date> {

    public DateConverter() {
//        System.out.println("初始化........");
    }

    static List<SimpleDateFormat> sdfs = new ArrayList();

    static {
        sdfs.add(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"));
        sdfs.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        sdfs.add(new SimpleDateFormat("yyyy-MM-dd"));
        sdfs.add(new SimpleDateFormat("yyyy/MM/dd"));

    }

    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf = null;
        if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}$", s)) {
            sdf = sdfs.get(1);
        }
        else if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}$", s)){
            sdf = sdfs.get(0);
        }
        else if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", s)){
            sdf = sdfs.get(3);
        }
        else if (Pattern.matches("^\\d{4}-\\d{2}/-\\d{2}}$", s)){
            sdf = sdfs.get(2);
        }

        Date date = null;
        try {
            date = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;

    }
}
