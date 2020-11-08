package Calendar;

import java.util.Calendar;

/*
    calendar是一个抽象类 里面提供了很多操作日历的抽象方法
    calendar类无法直接创建对象 但是它有很多静态方法和静态变量 getInstance返回calendar子类对象
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//涉及到了多态
        System.out.println(c);
    }
}
