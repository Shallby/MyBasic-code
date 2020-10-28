package come.atseu.java;

import java.util.Arrays;

/*
   面向过程：实现功能都是我自己提前编写相应能够实现个方法，每个过程都亲历亲为。
   面向对象：不关心怎么实现的，去找一个能实现这个功能的人，帮我做事情  简单就是两个字 偷懒

生活中的面向对象举例：
   1.洗衣服
        面向过程：脱衣服 找一个盆 加水 泡十分钟 揉揉 洗一洗 拧干 晾衣服
        面向对象：脱衣服 打开洗衣机 扔进去 按钮 晾衣服   显然 面向对象更加省心省力
   2.吃饭
        面向过程：买菜 洗菜 炒菜 收拾 洗碗
        面向对象：进店 吃 走
总结：
    将事情简单化 我们从执行者变成了指挥者
    面向对象的三大特点 继承 多态 封装
 */
public class Demo01OopDefine {
    public static void main(String[] args) {
        int[] Array={1,2,3,4,5};
//要求打印的格式为[1,2,3,4,5] 使用面向过程
        for (int i = 0; i < Array.length; i++) {
            if(i==0) System.out.print("[");
            if(i==(Array.length-1)){
                System.out.println(Array[i]+"]");
            }else System.out.print(Array[i]+", ");
        }
        //从上可以见到 各个细节都是需要自己去编写好每个方法的细节
        System.out.println("*****************************");
        System.out.println(Arrays.toString(Array));
        //下面是找的JDK提供好的Arrays这个类，其中的一个toString方法，直接就能把数组变成我们之前写了一堆的 效果都是一模一样的
    }
}
