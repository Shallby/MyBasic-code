package Introduce;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
异常：指的是程序在执行的过程中，出现的非正常情况，最终会导致JVM的非正常停止。
     不是编译错误，否则都不可能出现。class字节码文件
     当异常被处理掉之后程序就可以继续正常运行了
Throwable 是异常的根类  所有错误的父类 下面有error和exception两大类
        二者的区别
        1.Exception编译期异常，也称为写代码时期异常,这个异常如果在编写代码的时候不去解决 那就编译不了 必须要用try catch或者是别的异常处理机制将其处理
            RuntimeException：运行期异常，是指的是在运行中出现的异常
            异常就是相当于程序的了一个小毛病（感冒，发骚），把异常处理掉之后程序就又可以正常运行了
        2.Error：就相当于程序得了癌症，无法治愈的毛病必须修改源代码，程序才能继续运行


 */
public class Except {
    public static void main(String[] args)  {
        //Exception
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy- mm-dd");
//        try {
//            Date date=sdf.parse("1999-0909");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        //RuntimeException
        int[] arr ={1,2,32};
        try {
            //可能出现异常的代码
            System.out.println(arr[3]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }catch (Exception e){
            //异常的处理逻辑
            System.out.println(e);//这里只是打印了异常的名字 具体怎么处理没有任何操作
        }
        System.out.println("后续代码");
    }
}
