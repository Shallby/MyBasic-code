package come.atsue.java;
/*
在java中所有的""都是用字符串对象来保存的  都是new出来的对象
1.字符串的内容永不可变
2.由于不可改变 那么字符串是可以共享使用
3.相当于一个数组 []

创建字符串的常见3+1种方式
三种构造方法
public String（）；创建一个空白字符串，不含任何内容
public String （char[] array）根据字符数组的内容，来创建对应的字符串。
public String （byte[] array）根据字符数组的内容，来创建对应的字符串。
一种直接创建      这些都是底部实现  要看API才能知道怎么把字符串给创建出来的
    String str="这是最简单的创建字符串的方法，但是没有用new 没有直接调用构造器  但是要了解 我们虽然没有new 但是jvm自动帮忙new使用了构造器 只要是字符串 准是对象"
 */
public class Stringlasss {
    public static void main(String[] args) {
        String str1 =new String();//小括号流控什么都没有的空白字符串
        System.out.println("第一个字符串"+str1);
        char[] charArray ={'1','2','c'};//这是提前保留好的对象  就是按照这个格式去创造内容
        String str2=new String(charArray);//小括号流控什么都没有的空白字符串
        System.out.println("第一个字符串"+str2);
    }
}
