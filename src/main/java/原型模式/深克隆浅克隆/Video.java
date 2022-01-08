package 原型模式.深克隆浅克隆;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//视频原型
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video implements Cloneable {

    private String title;

    private Date createTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
