package 原型模式.深克隆浅克隆;

import java.util.Date;

public class Test {
    /**
     * todo 浅克隆是实现Cloneable接口，实现clone接口
     *      是一个新对象，但是属性的引用也引用过来了
     * todo 深克隆对clone方法重写，对对象对属性也进行克隆
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Video video = new Video();
        Date date = new Date();
        video.setTitle("你好");
        video.setCreateTime(date);
        Video clone = (Video) video.clone();
        System.out.println(video);
        System.out.println(clone);
        date.setTime(1);
        System.out.println(video);
        System.out.println(clone);
    }
}
