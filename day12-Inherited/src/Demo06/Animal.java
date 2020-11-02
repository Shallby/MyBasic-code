package Demo06;
/*
抽象方法：就是加上abstract关键字然后去掉大括号 直接分号结束
抽象类：抽象方法所在的类必须是抽象类  也必须要加上abstract
      抽象类中可以有普通的方法体
如何使用抽象类以及抽象方法：
1.不能直接创建抽象类的对象，肯定得是一个具体的类下面的对象
2.必须要有一个子类来继承抽象类，使之成为一个具体的类进一步可以创建对象
3.子类必须override抽象父类中的所有抽象方法 也就是去掉抽象方法的abstract方法，然后补上方法体 大括号
4.创建子类的对象.

注意事项
    1.抽象类不能创建对象
    2.抽象类中，可以有构造方法，是供子类创建对象时，初始化父类成员使用的
    3.抽象类中，不一定包含抽象方法，但是抽象方法的类必定是有抽象类 这个好理解 因为只要是出现了abstract关键字 那么就一定是
    4.没有任何抽象方法的抽象类也是不能直接创建对象的 也是需要由子类继承之后再创建子类的对象
 */
public abstract class Animal {
    public abstract void eat();//没办法具体，定义一个抽象方法
    public abstract void sleep();//没办法具体，定义一个抽象方法

    //这是普通的成员方法
    public void normalMethod(){

    }
    public Animal(){
        System.out.println("抽象父类的构造方法");
    }
}