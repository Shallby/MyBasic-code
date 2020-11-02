package Demo02Extends;
/*
子类继承父类的所有东西 包括static静态变量和静态方法

在父子类的继承关系中 ，如果成员变量重名，则创建子类对象时 有两种访问方式
直接通过子类对象访问成员变量
    等号左边是谁就优先用谁，没有就向上找。
间接通过成员方法访问成员变量
    调用的方法是谁的，那么这个方法调用的成员变量就是谁的
    即父类方法调用的 就是父类的同名成员变量
     子类方法调用的 就是调用的子类的同名成员变量
 */
public class Use {
    public static void main(String[] args) {
        Fu fu=new Fu();
        System.out.println(fu.age);
        fu.show();
        Zi zi=new Zi();
        System.out.println("这是子类调用的方法");
        zi.show();
        System.out.println(zi.age);
        System.out.println("================");
        System.out.println(zi.num);//子类优先  这是直接寻找 10
        System.out.println("子类中调用的num是10");
        zi.numShow();//这个时候调用的成员变量优先调用的是父类中的 只属于简介调用 100
    }
}
