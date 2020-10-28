package come.atseu.java;
/*
一个方法可以有多个参数 但是返回值只能有一个
如果非要一个方法返回多个参数那么怎么办？
简单 用返回的是一个数组就好了
 */
public class ArrayReturn {
    public static void main(String[] args) {
        int[]ArrayResult=Calculate(1,2,3);
        System.out.println("总和为"+ArrayResult[0]);
        System.out.println("平均值"+ArrayResult[1]);
    }
    public static int[] Calculate(int a,int b,int c){
        int sum=a+b+c;
        int average=sum/3;
        //两个数据都想要 那么久new一个数组就好了
        int[]   Array=new int[2];
        Array[0]=sum;
        Array[1]=average;
        return Array;
    }

}
