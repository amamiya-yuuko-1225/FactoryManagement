package org.sse.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
@Data
public class Product {

    @TableId(type = IdType.AUTO)
    private long id;
    private String product_name;
    private long amount;
    private long price;
    private Device device;//一对多
}
