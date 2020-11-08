package WhatObject;

import java.util.Objects;

/*
     Person类默认的是继承了Object类 所以可以使用equals 和 toString方法
     boolean equals（object obj）指的是其他某个对象是否和次对象“相等”

public boolean equals（object obj）{
    return this==obj;
}
    低于对象equals是比较的地址
    ==对于基本数据类型是比较的内容，而对于引用数据类型 是比较的两个对象的地址值；

    比较地址值没有意义 需要重写

    Object类是所有类的祖宗类，常用的有toString方法 对于字符串的对象是输出内容 对于别的类是输出的是地址值
    和equals方法

    Objects类是一个工具类 它有一个静态成员方法equals方法 这是直接的放入两个对象
*/
public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("小泽玛利亚", 22);
        Person p2 = new Person("玛尔扎哈拉", 22);
        Person p3 = new Person("玛尔扎哈拉", 22);
        p1.toString();
        p2.toString();
        boolean result = p1.equals(p2);
        System.out.println(result);//false
        System.out.println(p2.equals(p3));//true 这就是重写了  虽然比较的两个对象不在同一地址值 但是内容相同 那么也是可以的
        System.out.println(Objects.equals(p3, p2));//这里没有重写而是调用了Objects类下面的静态方法equals方法
    }
}
