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
@TableName("orders")
public class Order implements Serializable {
    @TableId(type = IdType.AUTO)
    private int id;
    private String buyer;
    private long productId;
    private int targetAmount;
    private int status;
    private int value;
}
