package come.atsue.java;
/*
总结 Static属性在敲代码的时候是没有提示的 只能自己敲 要记住成员属性名称 这是不推荐的  最好也是用类.属性来修改
    而且使用类.还有提示
    只有成员方法才有在.之后就会有一定得显示
    对于静态方法 是可以直接用类来直接调用的 不需要去创建对象 这样子会节省内存空间一些



注意：
    1.静态方法不能访问非静态变量 不能直接访问成员变量 //原因是：在内存中是先有的静态内容 ，后有非静态内容
    2.成员方法可以访问成员变量 也可以访问静态变量
    3.静态方法中不能有this.关键字  因为静态方法的实现是没有调用对象 而是直接的利用class.方法名去实现的
 */
public class StaticUse {
    public static void main(String[] args) {
        StaticKeyWords student1=new StaticKeyWords("洪七公",108);
        StaticKeyWords student2=new StaticKeyWords("黄老邪",88);
        System.out.println(student1.getName()+"是第一个学生的姓名");
        StaticKeyWords.Show();//直接调用的是static类型的数据
        student1.Show();//这是通过创建对象来调用方法的 其实在jvm中还是会把这句代码转换成相应的class
        student1.room="101教室";
        System.out.println(student1.getName()+",今年"+student1.getAge()+"岁了"+"在"+student1.room+"教室");
        System.out.println(student2.getName()+",今年"+student2.getAge()+"岁了"+"在"+student2.room+"教室");
        StaticKeyWords.room="101";
        System.out.println(student1.getName()+",今年"+student1.getAge()+"岁了"+"在"+student1.room+"教室");
        System.out.println(student2.getName()+",今年"+student2.getAge()+"岁了"+"在"+student2.room+"教室");
    }
}
