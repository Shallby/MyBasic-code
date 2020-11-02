package come.atsue.java;
/*
String 当中与获取相关的常用方法有：

public int length（）:
public String concat(String ste);将当前字符串与参数字符串拼接成为返回值新的字符串
public char charAt（int index）；获取索引位置的单个字符
indexOf（String str）：查找参数字符串在本字符中首出现的索引位置 弱国没有返回-1值
 */
public class StringGet {
    public static void main(String[] args) {
        int length ="ksajdlkasjhdlaksjjdaskj".length();
        System.out.println("字符串的长度为"+length);

        String str1="Hello";
        String str2="World";
        String str3=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("++++++++++++++++++++++++");

        //获取首次出现的索引位置
        char ch="Hello".charAt(1);
        System.out.println("在1号索引位置的字符是："+ch);
        System.out.println("===========");


        //返回在已知字符中首次出现某字符的第一次索引位置
        String original ="Hello world";
        int index=original.indexOf("llo");
        System.out.println("第一次出现oll的索引为"+index);
    }
}
