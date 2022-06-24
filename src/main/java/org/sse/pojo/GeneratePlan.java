package org.sse.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class GeneratePlan {
    @TableId(type = IdType.AUTO)
    private long id;
    private long product_id;
    private long target_amount;
    private long existing_amount;
    private String start_time;
    private String deadline;
    private long factory_id;
    private int status;
}
