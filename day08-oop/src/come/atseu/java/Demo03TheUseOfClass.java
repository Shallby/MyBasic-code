package come.atseu.java;
import come.atseu.java.Demo02_DefinationOfClass;//可以省略 因为是在同一个包
/*
 刚刚创建了一个学生类 现在需要学会如何使用了
1.导包：也就是指出需要使用的类 在市面位置
    import 包名称，类名称；对于和当前类在同一个包中的类就不要写导包语句
    import come.atseu.java.Demo02_DefinationOfClass
2.创建格式：
    类名称 对象名/变量名=new 类名称（）；
    Demo02_DefinationOfClass Stu= new Demo02_DefinationOfClass();
3.使用方法，分为两种情况
  使用成员变量：变量名.成员变量名
  使用成员方法：变量名.成员方法名
 */
public class Demo03TheUseOfClass {
    public static void main(String[] args) {
        Demo02_DefinationOfClass Stu= new Demo02_DefinationOfClass();
        System.out.println(Stu.Name);//由于什么都没赋值 所以这两个成员变量都是默认值  之前学习到 字符串 以及引用类型的都是null
        System.out.println(Stu.age);//整数都是0，小数都是0.0
        Stu.eat();
        Stu.sleep();
        Stu.study();
        Stu.Name="泰勒.斯威夫特";
        Stu.age=18;
        System.out.println(Stu.Name);
        System.out.println(Stu.age);
    }
}
