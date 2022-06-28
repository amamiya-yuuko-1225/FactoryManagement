package org.sse.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("factories")
public class Factory {
    @TableId(type = IdType.AUTO)
    private int id;

    private String factory_name;
    private String owner;
    private int profit;
    private int scale;

}
