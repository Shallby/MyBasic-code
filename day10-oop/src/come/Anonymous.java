package come;
import java.util.Scanner;
/*
之前学习到了任何数据类型 哪怕是数组都可以作为输入参数 返回参数 那么匿名对象能否作为anonymous能否也作为参数呢？

 */
public class Anonymous {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println("采用创建对象方式输入的是"+num);
      //采用匿名对象输入的方法
        int num1=new Scanner(System.in).nextInt();
        System.out.println("采用anonymous输入的是"+num1);
      //更有甚者 直接用匿名对象anonymous来传入参数
        System.out.println("各位 我是直接用的匿名对象作为方法的输入参数 甚至连手都没有倒一下"+new Scanner(System.in).next());

    }
}
