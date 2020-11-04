package InnearClass;
/*
身体和心脏的关系 汽车和发动机的关系
    一个事物的内部包含着另外一个类 只能在里面才能工作
分类：
1.成员内部类
2.局部内部类（包含匿名内部类）


成员内部类的定义格式：
修饰符 class 类名称{
      修饰符 class 类名称{
      。。。//
      }
    。。。//
}

注意：内用外，随意访问 权限不受影响
     外用内，需要内部类对象
如何使用成员内部类？
    1.简介方法：成员外部类的方法中，通过匿名对象调用内部类，main只是调用外部类的方法
    2.直接方法，类似于创建对象的公式：
        外部类名称.内部类名称 对象名 =new 外部类名称().new 内部类名称（）；
        总结就是外.内
 */
public class InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        //间接调用内部类的方法
        body.methodbody();
        //直接调用  按照创建公式来
        Body.Heart heart=new Body().new Heart();
        heart.beat();

        Outer.Inner inner =new Outer().new Inner();
        inner.method();
        //利用定义在方法中的局部内部类
        inner.methodOuter();
    }
}
