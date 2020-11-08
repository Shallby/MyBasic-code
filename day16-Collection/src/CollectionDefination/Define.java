package CollectionDefination;

import java.util.ArrayDeque;
import java.util.Collection;

/*
集合和数组都是容器
    数组长度是固定的 集合的长度是可变的
    数组中存储的都是一种类型的元素，集合是可以存储对象的 而且是只能存储对象的  一般当有多个对象的时候 就是和用集合来存储

集合的框架
    Vector集合 ArrayList集合 TreeSet集合
目标
    1.会使用集合存储数据
    2。会遍历集合 把数据取出来
    3.掌握每种集合的特性
集合框架的学习方式
    1.学习顶层：学习顶层接口/抽象类中共性的方法，所有的子类都可以使用
    2.使用底层：底层不是接口就是抽象类，无法创建对象，需要使用底层的子类创建对象使用
Collection接口
    定义的使所有单列集合中共性的方法  单列集合包括List Set  这两个也是接口 也是需要实现类
                    ArrayList LinkedList     Vector
                    HashSet  LinkedHashSet   TreeSet
    所有的单列集合都可以使用共性的方法
    没有索引的方法
Collection 有许多常用的静态方法 可以通过创建集合对象之后来
 */
public class Define {
    public static void main(String[] args) {
        //创建结合对象
        Collection<String> coll=new ArrayDeque<>();//这就涉及到了多态哦
        //boolean add(E e);向集合中添加对象  这里E是泛型的意思
        coll.add("Hello");
        coll.add("world");
        coll.add("java");
        System.out.println(coll);
        //boolean remove(E e); 删除集合中的某个元素 删除失败会返回false
        boolean result =coll.remove("Hello");
        System.out.println(result);
        System.out.println(coll.toString());//实际上toString方法已经得到了重写 这里就是返回的内容
        //void clear();清空集合中的所有内容
        //coll.clear();
        //boolean contains(E e);  判断对象中是否有e这个对象  有就返回true
        boolean result2=coll.contains("java");
        System.out.println(result2);
        //boolean isEmpty(){}
        System.out.println("这是一个空的集合吗"+coll.isEmpty());
        coll.add("我瞎写的");
        System.out.println(coll);
        //public Object[] toArray（）{}//变为一个数组
        Object[] array = coll.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
