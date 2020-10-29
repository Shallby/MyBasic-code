package come.atsue.java;
/*
什么是构造器 什么是构造方法 ？
    当我们创建对象 也就是new 方法名（） 这就是调用了构造方法
格式：
    public 类名称（参数类型 参数名称，，，，，）{
    方法体
    }
注意：1.构造方法的名称必须和类名称一模一样 一定都不能有一点区别
     2.构造方法不要写返回值类型，连void都不能有 构造器唯一能用的修饰符 就是一个public
     3.没有编写构造方法时，编译器会自动创建一个空的构造方法，这个方法是什么都没做 空的，当我们自己定义了相应的构造方法 原来的方法就会消失
     4.构造方法也是可以重载的 和一般的方法都是一样 可以重载 overload
作用：
    1.在创建对象之际就能给对象赋初值；
    2.
 */
public class Student {
    private String Name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Student(){
        setAge(18);
        setName("Taylor Swift");
        System.out.println("我刚刚用了构造器创建了对象 而且我还给对象设置了初值");
        this.Name="Taylor Swift2号选手 来自于this关键字创建的新名字";
    }
    public Student(int age,String Name){
        this.age=age;
        this.Name=Name;
    }
}

