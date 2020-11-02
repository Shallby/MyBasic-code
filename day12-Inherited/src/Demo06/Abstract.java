package Demo06;
/*
抽象类 只是定义了成员方法名 没有具体定义成员方法体  这个方法称为抽象方法

例如：图形类下面的子类可以有正方形 三角形 圆形 图形类定义的面积方法没法具体 只能写一个方法名 不能给具体
     动物类下面的子类可以有猫 汪
如果 父类中的方法不确定如何实现 那么这个方法就称为抽象方法

 */
public class Abstract {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.eat();
        cat.sleep();
    }
}
