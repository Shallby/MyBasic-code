package come.atseu.java;
/*
Math类和Arrays类一样 都是一个工具类 提供了大量的静态方法，完成与数学运算相关的操作。

public static double abs（double num）取绝对值的的方法
public static double ceil（double num）向上取整。
public static double floor（double num）向下取整  都不是四舍五入
public static long round（double num）四舍五入
Math.PI这是一个常量 3.14926
还是静态方法都是可以直接运用类.静态方法直接调用
 */
public class MathClass {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(-323));

        //向上取整
        System.out.println(Math.ceil(3.23));//得到四点零  他是不管小数后面是有多少位 都是直接以第一位小数作为对照
        System.out.println(Math.round(3.23));//四舍五入
        System.out.println(Math.sin(Math.PI/2));
    }
}
