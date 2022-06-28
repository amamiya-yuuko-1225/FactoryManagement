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
@TableName("accounts")
public class Account {
    @TableId(type = IdType.AUTO)
    private int id;
    private String username;
    private String email;
    private String password;
    private byte[] pic = null;
}
