package org.sse.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


@Data
public class Account {
    @TableId(type = IdType.AUTO)
    private long id;
    private String username;
    private String email;
    private String password;
    private byte[] pic = null;
}
