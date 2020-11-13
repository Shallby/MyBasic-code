package Introduce;

import java.util.Scanner;

/*
java异常处理的五个关键字：try catch finally throw throws

1.throw关键字  作用是抛出异常
    使用Throw在指定的方法中抛出指定的异常
  使用格式：
    throw new xxxException（"异常产生的原因"）
   注意：
    1.throw关键字必须写在方法的内部
    2.throw关键字的new的对象必须是Exception或Exception的子类对象
    3.throw关键字抛出指定的异常对象，我们必须处理这个异常对象
         throw关键字后边创建的是RuntimeException或者是其子类对象，我们可以不用处理，默认交给JVM处理（打印异常对象，中断程序）
         throw关键字 创建的是编译异常（写代码的原因报错），我们就必须处理这个异常对象，要么throw要么try。。。catch
 */
public class DealException {
    public static void main(String[] args) {
            method("s");
            method(null);
            method(new Scanner(System.in).next());

    }
    public static void method(String a){
        //对输入进行合法校验
            if (a ==null){
                throw new NullPointerException("输入的参数为空");
            }
        System.out.println(a);
    }
}
