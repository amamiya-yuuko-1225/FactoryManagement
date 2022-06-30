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
@TableName("report")
public class Report implements Serializable{
    @TableId(type = IdType.AUTO)
    private int id;
    private int productId;
    private int amountAll;
    private int amountGood;
    private String data;
}
