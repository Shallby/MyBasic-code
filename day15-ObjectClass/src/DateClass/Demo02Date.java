package DateClass;

import WhatObject.Person;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        Person p1 = new Person("刘德华",18);
        date();
        Date d2 = new Date(0l);//这就是将毫秒值转化为计算相应的年数  从1970开始网上计算的
        Date d3 = new Date(6546413521541l);//这就是将毫秒值转化为计算相应的年数  从1970开始网上计算的
        System.out.println(d2);
        System.out.println(d3);
        demo();
        p1.toString();
    }

    private static void demo() {
        System.out.println("这个方法是我先进行的创立方法名字 然后再点击快捷键");
    }

    private static void date(){
        Date date = new Date();
        System.out.println(date);
    }
}

