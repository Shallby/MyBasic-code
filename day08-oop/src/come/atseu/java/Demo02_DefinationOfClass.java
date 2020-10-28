package come.atseu.java;
/*
1.什么是类呢？
  是一类相关属性和行为的集合，是一系列相似事物的模板
2.对象是什么呢？
  对象就是类的实例化，是具体的，将抽象的一个类给实体出来，例如将手机大类的图纸真真的做出一款手机 例如小米手机
  真正儿的创建了一台手机

类的定义格式
public class ClassName/类名
   定义个学生类
属性（是什么）
    姓名 年龄 班级 身高。。。，
行为（能做什么）
    吃饭 睡觉 学习

成员变量（属性）：
    String 姓名 ;Int 年龄
成员方法（行为）：
    public void eat(){}//记住 普通的方法是带static修饰的  而成员方法是不能带Static修饰的
    public void sleep(){}
    public void study(){}

注意事项：
    1.成员变量是直接定义在类中的 不是在方法题中。
    2.成员方法不能用static关键字进行修饰。
 */
public class Demo02_DefinationOfClass {
    //成员变量：
    String Name;//没有方法 不在方法体中 不是普通的变量 是成员变量
    int age;
    //成员方法：
    public void eat(){
        System.out.println("学生吃饭饭");
    }
    public void study(){
        System.out.println("学生在努力学习呢");
    }
    public void sleep(){
        System.out.println("学生们在好好的休息");
    }

}
