package come.atsue.java;
/*
==是对对象进行地址值进行比较的  如果是想对支付传递实际内容就进行比较那么可以用以下两个方法
public boolean qpuals(object obj):参数可以是任何对象，只是参数是一个字符串并且内容相同才会给true 否则返回false
备注：任何对象都只能用object进行接受
1.任何对象都能调用.equals方法 因为这个是方法定义于Object类中 这是所有类的祖宗
2.equals方法具有对称性 也就是 a和b等价于b和a
3.推荐用”字符串“.equals方法来调用 因为这样子更好 效果更棒  即推荐”abc“.equals(object/str) 来查看字符串对象的实际内容
 */
public class StringEquals {
    public static void main(String[] args) {
        String str1 ="Hello";
        String str2 ="Hello";
        char[] charArray={'H','e','l','l','o'};
        String str3 =new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));//四个全都是True 都是正确的


    }
}
