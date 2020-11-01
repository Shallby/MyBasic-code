package come.atsue.java;

/*
字符串常量池：程序中直接写上的双引号字符串""，这类都是直接存放在字符串常量池中
自己创建的 也就是使用了另外的三种方法产生的字符串数组都不在字符串常量池


复习数组也是对象  int[] char[]等等数组都是对象 都是有对应的方法 如对象。fori这就是一个方法 能够实现快速创建for循环

字符串常量池是在内存的堆当中的

对于基本类型==是进行数值的比较
队医引用数据类型 == 是进行的地址值的比较
 */
public class StringPool {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";
        char[] Array={'a','b','c'};
        String str3=new String(Array);//这个构造器能够将字符转化为byteascll代码 进一步还可以转换为字符
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
    }
}
