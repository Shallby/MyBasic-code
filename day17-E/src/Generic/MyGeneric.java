package Generic;
/*
定义一个含有泛型的类 来模拟Arraylist集合
    泛型是一个未知的数据类型，当我们不知道放什么对象的时候 可以使用泛型
    创建对象的时候自动确定数据类型
 */
public class MyGeneric {
    public static void main(String[] args) {
        MyG<String> stringMyG = new MyG<>();
        stringMyG.setName("刘德华");
        System.out.println(stringMyG.getName());//打印姓名
        //传递什么数据类型的参数  接受的就是什么数据类型的
        stringMyG.MyFuncGeneric("abc");
        stringMyG.MyFuncGeneric(12341);
        stringMyG.MyFuncGeneric(1321.0);
        stringMyG.MyFuncGeneric(true);
        MyG.StaticMethodGeneric("这是调用的含有泛型的静态方法");
    }
}
