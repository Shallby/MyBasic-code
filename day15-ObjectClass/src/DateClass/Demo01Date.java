package DateClass;
/*
    表示日期和时间的类 精确到毫秒 特定的瞬间
    1000毫秒等1秒
    2020-11-06-09:21:35:222
    利用毫秒值，可以对时间和日期进行计算
 如：2015-10-25----2020-10-9一共有多少天
     可以将日期转化为毫秒 利用毫秒进行计算
 */
public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前时间到1970年1月1日一共经历了多少毫秒
        long l = System.currentTimeMillis();//利用毫秒值计算还有多少天
        System.out.println(l/(365*86400000));
    }
}
