package WhatObject;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//覆盖重写了toString方法 而且idea直接生成了打印内容 这是得多强啊！
    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.name + '\'' +
                ", age=" + age +
                '}';
    }
    //这是我自己重写的equals方法 实际上 可以alt+insert快捷键自动创建
//    @Override//这里涉及到一个向下转型 必须要要将Object类型的给强制转换为Person
//    public boolean equals(Object obj) {
//        if(this.name == ((Person) obj).name&&this.age==((Person) obj).age){//这里是一个向下强制转型
//        return true;
//        }
//        else return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//提高效率 都只直接不用比了
        //使用反射技术 判断i是否为Person类型
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);//Objects是一个工具类 用到了工具类的静态方法
    }
    //Objects下面的equals方法 可以容忍null空对象 就是能接受空指针异常 他是直接对两个对象进行比较有一个a==b 这就可以直接先比较
    //是否有空null类
}
