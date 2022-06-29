package org.sse.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("factories")
public class Factory implements Serializable {
    @TableId(type = IdType.AUTO)
    private int id;

    private String factoryName;
    private String owner;
    private int profit;
    private int scale;

}
