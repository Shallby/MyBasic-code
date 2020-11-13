package DateStructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
   list有序的collection，这个接口是有索引的
   结合中可以保存相应的重复的对象和元素
特点：
    1.有序的集合，存储元素和取出元素的顺序是一致的（123 取出的也是123）
    2.有索引，包含了一些带索引的方法
    3.允许重复的元素
Arraylist集合 是list接口的一个实现类  这个集合底层仍然是以数组来实现的 可以保存对象  拥有泛型的特点
    Arraylist使用用来做查询相关的功能 不太适合用于做增删的操作
Linkedlist集合 也是list集合的第二个实现类  底层是靠链表实现的  所以适合于增删 不太适合查询
    同时这个linkedlist拥有大量关于首位操作的方法
set集合 没有带索引的方法 不能装相同的内容 这是它的量大特点 也不能使用普通的for循环实现遍历
        它有的实现类有hashSet hash表的速度很快
vector集合 了解一下
 */
public class ListInterface {
    public static void main(String[] args) {
        //创建一个list集合对象 使用到了多态
        List<String> list = new ArrayList<>();
        //使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //打印集合
        System.out.println(list);//重写了toString方法

        //在集合之间添加一个新的元素
        list.add(3,"李元勋");
        //移除元素remove方法
        System.out.println("被移除的元素是"+list.remove(1));
        System.out.println(list);
        //set方法
        list.set(0,"这是新来的 走的是set方法");
        System.out.println(list);
        //get方法list结合的遍历
        for (int i = 0; i <list.size() ; i++) {
            //利用get方法
            System.out.println("走的是for循环外加get方法"+list.get(i));
        }
        //运用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
