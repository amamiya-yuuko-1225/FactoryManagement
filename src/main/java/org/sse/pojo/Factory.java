package org.sse.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Factory {
    @TableId(type = IdType.AUTO)
    private long id;
    private String factory_name;
    private String owner;
    private int profit;
    private int scale;
}
