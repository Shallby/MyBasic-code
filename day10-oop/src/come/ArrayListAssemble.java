package come;

import java.util.ArrayList;

/*
数组的长度不可以发生改变
ArrayList是可以改变长度的  同样也可以装对象

对于ArrayLsit有一个尖括号E
泛型 装在集合中的所有元素都是统一的类型 是一个类型信息
注意 泛型只能是引用类型的数据 不能基本数据类型
 */
public class ArrayListAssemble {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称为list 里面全是String类型
        //从JDK1.7开始，右侧的尖括号可以不用写内容 但是那个<>仍然是需要的。
        ArrayList<String> list =new ArrayList<>();//好比一个数组
        System.out.println(list);//打印一个对象按道理应该是对象的地址值
        //注意  对于Arraylist直接打印得到不是地址值 而是内容 如果是什么都没有 那么就是一个[]
        //这个源自于ToString方法在Arraylist中被重写了
        list.add("赵丽颖");
        list.add("泰勒.斯威夫特");
        System.out.println(list);//由于尖括号已经写好了String,那么能够添加的就是String类型的 不能搞错
    }
}
