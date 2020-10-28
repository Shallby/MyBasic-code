package come.atseu.java;

import javax.print.attribute.standard.MediaPrintableArea;
import java.lang.reflect.Array;

/*
运用方法来打印数组
方法的输入可以是数组
 */
public class ArrayForPrint {
    public static void main(String[] args) {
        int[] Array={23,24,53,123};
        String[] Array2={"我是一只小小鸟","想要飞的老高高"};
        printArray(Array);
        System.out.println("刚刚调用了数组的方法打印");
        printArray(Array2);
        System.out.println("刚刚重载了方法，并且调用了字符串的打印");
    }
    //打印一个int型的数组
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("元素"+i+":"+array[i]+"   ");
        }
        System.out.println("");
    }

    //涉及到方法的重载
    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("元素"+i+":"+array[i]+"   ");
        }
        System.out.println("");
    }

}
