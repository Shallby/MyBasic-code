package come.atseu.java;

import java.lang.reflect.Array;

/*
    封装 继承 多态
封装性的体现：
1.方法是一种封装性
2.关键字Private也是一种封装性   直接放在 成员变量的类数据类型之前  然后用set getxxx方法 同时set方法不能有返回值 get方法不能有参数

在定义一个类时，如果为了保护成员变量不被修改，可以用private修饰进而保护该成员变量
private修饰的成员变量在本类中仍然是可以随意访问，当时超出了本类就不能直接访问了
    也就是在类中定义了一个private修饰成员变量 在别的地方无法直接修改访问 但是类中的方法依旧是可以直接访问并作一定得修改
    因此 必须要在类中专门写对应的getset相应属性的成员方法，用于专门倒手设置 在idea中有已经写好的对应模板 用类中的方法去调用
 */
public class Demo07Method {
    public static void main(String[] args) {
        int[] Array={1,2,3,4,5,6,7};
        System.out.println(Getmax(Array));
        Person1 p1=new Person1();
        Person p2=new Person();
        p1.name="Taylor.Swift";//这里为什么还可以调用呢  因为这个类是定义在我这个public class大类中的 符合调用的条件
        p1.age=18;
        p1.show();
        p1.dance();
//        p2.name="Taylor.Swift2号选手";//现在还是可以调用的 但是如果去person类中将这两个属性定义为private 那么久不能在调用了
//        p2.age=18;
        p2.setAge(19);
        p2.setName("Taulor.Swift2号选手");
        System.out.println("*******************");
        p2.show();

    }
    public static int Getmax(int[] Array){
        int max=Array[0];
        for (int i = 0; i < Array.length; i++) {
            if(max<Array[i]) max=Array[i];
        }
        return max;
    }



    static class Person1 {
        private int age;
        private String name;

        public void dance(){
            System.out.println("我是"+name+  ",我跳舞很不错哦!");
        }
        public void show(){
            System.out.println("我是"+name+  ",我今年"+age+"岁了");
        }
    }
}


