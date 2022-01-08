package 原型模式.深克隆浅克隆;

import java.util.Date;

public class Test {
    /**
     * 浅克隆是实现Cloneable接口，实现clone接口
     *
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Video video = new Video();
        Date date = new Date();
        video.setTitle("你好");
        video.setCreateTime(date);
        Video clone =(Video) video.clone();
        System.out.println(video);
        System.out.println(clone);
        date.setTime(1);
        System.out.println(video);
        System.out.println(clone);
    }
}
