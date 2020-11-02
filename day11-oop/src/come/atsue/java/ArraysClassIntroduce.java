package come.atsue.java;

import java.util.Arrays;

/*
数组工具类 java。util。arrys 是一个数组相关的工具类，里面提供了大量的静态方法
public static String toString（数组）；将参数数组变成字符串
public static Array sort（数组）
 */
public class ArraysClassIntroduce {
    public static void main(String[] args) {
        int[] array={12,44,41};
        String intStr = Arrays.toString(array);
        System.out.println(intStr);
        Arrays.sort(array);//这个静态方法直接将一个int数组排好序而且将排序之后的数组地址值给原数组 sort方法默认是升序 从小到大进行
        System.out.println(Arrays.toString(array));
    }
}
