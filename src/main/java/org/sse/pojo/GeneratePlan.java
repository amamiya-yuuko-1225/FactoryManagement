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
@TableName("generateplan")
public class GeneratePlan {
    @TableId(type = IdType.AUTO)
    private int id;
    private long product_id;
    private int target_amount;
    private int existing_amount;
    private String start_time;
    private String deadline;
    private long factory_id;
    private int status;
}
