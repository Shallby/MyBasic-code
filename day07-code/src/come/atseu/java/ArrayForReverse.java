package come.atseu.java;
/*
数组本来是{1，2，3}
反转之后是{3，2，1}
注意用8%2表示8除2取余数
要求是不能使用新数组

本来我还想着判断一下数组大小是否为奇偶，后来发现 根据我用两个变量的方法，都是成立，是通用的
不需要分别判断。
 */
public class ArrayForReverse {
    public static void main(String[] args) {
        int[] Array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]+"  ");
        }
        System.out.println("");//为了好看 换一下行而已
//        if(Array.length%2==0){
//            for (int i = 0; i < Array.length/2; i++) {
//                int tempformin;//两个变量储存 并且待会儿用于交换首尾对应的元素
//                int tempformax;
//                tempformin=Array[i];
//                tempformax=Array[Array.length-1-i];
//                Array[i]=tempformax;
//                Array[Array.length-1-i]=tempformin;
//            }
//        }else {
//            for (int i = 0; i < Array.length / 2; i++) {
//                int tempformin;
//                int tempformax;
//                tempformin = Array[i];
//                tempformax = Array[Array.length - 1 - i];
//                Array[i] = tempformax;
//                Array[Array.length - 1 - i] = tempformin;
//            }
//        }
        for (int i = 0; i < Array.length/2; i++) {
                int tempformin;//两个变量储存 并且待会儿用于交换首尾对应的元素
                int tempformax;
                tempformin=Array[i];
                tempformax=Array[Array.length-1-i];
                Array[i]=tempformax;
                Array[Array.length-1-i]=tempformin;
            }
        System.out.println("开始反转啦注意啦");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]+"  ");
        }
    }
}
