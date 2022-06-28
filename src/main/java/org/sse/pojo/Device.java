package org.sse.pojo;
import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("devices")
public class Device {
    @TableId(type = IdType.AUTO)
    private int id;


    private String deviceName;
    private int status;
    private int product_id;

}
