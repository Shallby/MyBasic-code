package Demo04;
/*
super关键字用来访问父类的内容 而this关键字用来访问本类的内容 用法爷有三种
1.在本类的成员方法中，调用本类的成员变量
2.在本类的成成员方法，调用本类的另外一个成员方法
3.在本类的构造方法中，访问本类的另外一个构造方法
在构造方法中this（）也必须是第一个语句，而且也只能有一个
 */
public class ThisCompareWithSuper {
    String name;
    int num=20;
    public ThisCompareWithSuper(){

    }
    public ThisCompareWithSuper(String name){
        this.name=name;
    }

    public ThisCompareWithSuper(int age){
        this("wang");
        this.num=age;
    }
}
