package Demo03;

public class Zi extends Fu{
    public Zi(){
        super(12);//这是编译器赠送的 没有写也会送一个  由于这是子类是一个无参的构造器 那么父类一定要有一个无参的构造器
        //如果父类真的没有无参构造器 那么自己在子类中一定要添加一个super（有参）还得去调用父类的构造器
        //注意  只有子类的构造方法里面才能调用父类的构造方法 而且还有且只能调用一个父类的一个构造方法。

//        super();这个是调用的父类的一个无参构造器
        System.out.println("子类对象的构造器开始打印");
        System.out.println(super.age);
    }
}
