package CollectionDefination;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
iterator接口 也称作为迭代器
    也是java集合中的一员，Collection接口与Map接口主要用于存储元素，而iterator接口主要是以用于迭代访问（遍历）:
    迭代：即Collection集合元素的通用获取方式。在元素之前先要判断集合中有没有元素，如果有，就把这个元素取出来，再继续判断，如果还有就再取出来
常用方法：
    public Iterator iterator（）；获取一个迭代器 用来遍历集合    中的元素
    boolean hasNext()
    E next（）返回迭代的下一个元素

    Collection接口中有一个方法，叫iterator方法 返回的是一个iterator实现类
使用步骤
    1.使用集合中的iterator方法实现对象，使用iterator接口接收 多态
    2.使用接口中的hasNext（）
    3.使用 next（）方法取出集合中的下一个元素
 */
public class DeDaiQi {
    public static void main(String[] args){
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        coll.add("刘德华");
        coll.add("古天乐");
        coll.add("李元勋");
        coll.add("刘亦菲");
        coll.add("王菲");
        //使用集合中的方法iterator（）获取迭代器的实现对象，使用iterator接口接收（多态）
          /*  注意 Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么反省 迭代器就是什么泛型；

           */
        coll.remove("李元勋");
        coll.remove("古天乐");
        Iterator<String> it = coll.iterator();//返回一个iterator对象 用it接受
        System.out.println("调用了判断有没有元素"+it.hasNext());
        System.out.println("这次取出来的内容是"+it.next());
        System.out.println("调用了判断有没有元素"+it.hasNext());
        System.out.println("这次取出来的内容是"+it.next());
        System.out.println("调用了判断有没有元素"+it.hasNext());
        System.out.println("这次取出来的内容是"+it.next());
        System.out.println("调用了判断有没有元素"+it.hasNext());//没有元素就返回false
        System.out.println("这次取出来的内容是"+it.next());//再取出来就会抛出错误
    }
}
