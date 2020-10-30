package come;

import java.util.ArrayList;

/*
常用的ArrayList方法
1.public boolen add<E e>;往里面添加元素
2.public E get（int index）；从集合往外读取，返回值就是对应的元素。
3.public E remove（int index）；从集合中删除元素
4.public int size（）；获取集合的长度 返回的是集合的元素个数
5.list.fori 也是类似于数组的array.fori 能够很快的写好对应的遍历语句
 注意：在数组中[] 是以一个括号来结尾的 而在list和数组不一样 它有专门的方法 就是get方法。
      对其实现遍历的语法是 list.get(i);
 */
public class MethodOfArrayList {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        System.out.println(list);

        //向集合中添加元素
        boolean success=list.add("柳岩");//事实上 这个add方法是有返回值的 返回的是一个boolen量 这个返回值可以要 也可以不要 不会影响
        list.add("贾乃亮");
        list.add("刘德华");
        System.out.println(list);
        System.out.println("添加是否成功呢？"+success);
        System.out.println(list.get(2)+"000000"+list.size());
        System.out.println("被删除的人是"+list.remove(1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
