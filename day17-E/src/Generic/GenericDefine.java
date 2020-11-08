package Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
 1。 泛型：
    是一种未知的数据类型，当我们不知道使用什么数据类型的时候 可以使用泛型
    泛型可以看作一个变量 用来接收数据类型
    E e elements 元素
    T t type 类型
  ArrayList集合在定义的时候不知道都会储存什么数据类型 所以使用泛型E 未知数据类型
  2.使用泛型与不适用的区别
        集合不使用泛型则默认的泛型都是Object类型，可与储存任意类型的数据
      弊端
        不安全 会引起异常

 */
public class GenericDefine {
    public static void main(String[] args) {
        show2();
    }

    private static void show2() {
        /*
        使用泛型
            好处：1.避免了类型转换异常，储存的是什么数据类 取出的就是什么数据类型
                 2.把运行期的异常（代码运行之后会抛出的异常）提升到编译期
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("王小明");
        list.add("刘德华");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            //it.next()由于取出来的就是一个String类 所以就可以使用其特有的length方法
            System.out.println(it.next().length());
        }
    }

    private static void show1() {
        ArrayList list=new ArrayList();
        list.add("abc");
        list.add(1);
        //使用迭代器遍历list集合
        //获取迭代器
        Iterator it = list.iterator();
        //使用迭代器中的方法hasNext和Next（）方法遍历集合
        while (it.hasNext()){
            //取出元素也是Object类型
            System.out.println(it.next());

            //想要使用String类型的特有方法 如，length
            //需要向下转型
            String s= (String)it.next();
            //抛出了ClassCastException类型转换异常 不能把Integer类型转化为String数据类型
        }
    }

}
