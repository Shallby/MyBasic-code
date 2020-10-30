package come;

import java.util.ArrayList;

/*
Arraylist 只能是引用类型 因为集合类型的数据都是保存的地址值 而基本类型是没有地址的
String Object 是我们暂时的引用类型  为了能够实现将基本类型的数据放入list中
那就需要用 包装类将其包装一下 使得基本数据类型可以有地址值
基本类型    包装类
byte       Byte
short      Short
int        Integer//特殊
long       Long
float      Float
double     Double
char       Character//特殊
boolean    Boolean

 注意：从JDK1.5开始 能够实现自动装箱 以及自动拆箱
    装箱：基本类型变成包装类型
    拆箱：包装类型变成基本类型
 */
public class ArraylistBasic {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list1.add("赵丽颖");
        list2.add(123);
        System.out.println(list1.get(0));//认真的体会 什么叫做面向对象 创建对象 对象.方法实现调用！！！
        System.out.println(list2.get(0));
    }

}
