package WhatObject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01Tostring {
    public static void main(String[] args) {
        Person p = new Person("张三",12);
        //Person类继承了Object类 这里面有一个Tostring方法 这个方法是获取对象的地址值 没有意义
        String S=p.toString();
        System.out.println(S);
        //需要重写Tostring方法才有意义
        /*
            如果没有重写toString方法 那么就是打印的对象地址值
            重写之后就是打印的内容
         */
        Random r = new Random();
        System.out.println(r.toString());//打印的是一个地址值 包名 大对象内存地址
        System.out.println(r);//可以看到 Random中的toString方法没有重写覆盖
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);
        System.out.println(scanner.toString());//可以看到 打印的也是地址值 并没有重写
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.toString());//可以看到  这里的toString方法就已经重写了 是直接的打印的内容
    }
}
