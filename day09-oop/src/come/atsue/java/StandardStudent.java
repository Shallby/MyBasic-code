package come.atsue.java;
/*
一个标准的类有以下四个组成部分
    1.private修饰的成员变量
    2.为每一个成员变量编写getset方法
    3.编写一个无参构造器
    4.编写一个有参构造器
这样的一个类称为javaBean
        alt+insert shift +上下箭头
 */
public class StandardStudent {
    private int age;
    private String name;

    public StandardStudent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public StandardStudent() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
