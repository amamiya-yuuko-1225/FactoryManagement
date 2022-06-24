package org.sse.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;
@Data
public class Device {
    @TableId(type = IdType.AUTO)
    private long id;
    private String device_name;
    private int status;
    private List<Product> products;//一对多

}
