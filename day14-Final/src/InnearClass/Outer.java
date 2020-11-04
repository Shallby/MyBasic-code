package InnearClass;
/*
如果一个类是定义在一个方法内部的，那么这个类就是一个局部内部类

定义换格式：
修饰符 class 外部类名称{
    修饰符 返回值类型 外部类方法名称（参数列表）{
      class 局部内部类名称{
      //
     }
     局部内部类名称 对象名称 = new 局部内部类名称（）
     对象名。方法名
   }
 */

public class Outer {
    int num =10;
    public class Inner {
        int num =30;

        public void method(){
            int num=20;
            System.out.println(num);//就近原则调用内部类的局部变量;
            System.out.println(this.num);//内部类的成员变量
            System.out.println(Outer.this.num);//外部类的成员变量
        }
        public void methodOuter(){
            class innerMethod{
                public void methodinner(){
                    System.out.println("调用了局部内部类");
                }
            }
            innerMethod in1 = new innerMethod();
            in1.methodinner();//在实在方法中定义了一个局部内部类 同时马上创建了一个对象来调用
            //注意  这个局部内部类只能在方法中调用 不能给除了这个方法 出去了就不能用了
        }
    }
}
