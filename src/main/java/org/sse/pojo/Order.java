package org.sse.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
@Data
public class Order {
    @TableId(type = IdType.AUTO)
    private long id;
    private String buyer;
    private long product_id;
    private long target_amount;
    private long existing_amount;
    private int status;
    private long value;
}
