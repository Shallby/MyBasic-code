package come.atseu.java;
/*
封装性 private 继承性 多态性。
 1继承是多态的前提 如果没有继承就没有多态  继承是师父与徒弟之间的关系   师傅会什么 徒弟都会
 继承主要是解决类的共性问题 两个类中的一些东西都是相同的那么就可以放在同一个类 这个类成为父类 含有父类的所有并成为一个新的类称为子类

 继承关系中的特点  1 子类可以拥有父类的内容
                2 子类还可以拥有自己专有的内容
Extends 这是关键字
        在继承关系中子类就是一个父类，就是指子类可以当作父类来看待


继承的作用 达到了代码复用的作用
 */
public class InheritedClass {
    public static void main(String[] args) {
        Zi zi=new Zi();
        Zi2 zi2=new Zi2();
        zi.Method();
        zi2.Method();
    }

}
