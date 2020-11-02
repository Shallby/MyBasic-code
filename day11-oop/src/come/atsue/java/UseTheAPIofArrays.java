package come.atsue.java;

import java.util.Arrays;

/*
将一个随机字符串中的所有字符升序排列 并倒序打印。
 */
public class UseTheAPIofArrays {
    public static void main(String[] args) {
        String str="lkjhbcba";//这是一个随机创建的字符串数组
//        Arrays.toString(str);
        //如何升序排列呢  首先是必须要先变成数组 那么就要要将一个字符串变成一个数组
        char[] chars=str.toCharArray();//调用了字符串对象的toCharArray（）成员方法 实现了将字符串转化为一个字符数据类型的数组
        Arrays.sort(chars);//对字符数组进行升序排列  必须是一个数组才能用Arrays.sort（）方法
        //需要倒序便利
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars);
        }
    }
}
