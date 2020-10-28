package come.atseu.java;

public class ArrayForMax {
    public static void main(String[] args) {
        int[] Array={12,231,4,53,235,34,7645,7,24,312,4,36,4,754,25343,56,453,-2,98127468};
        int max=Array[0];
        int min=Array[0];
        for (int i = 0; i < Array.length; i++) {
            if(Array[i]>max){
                max=Array[i];
            }
        }
        for (int i = 0; i < Array.length; i++) {
            if(Array[i]<min){
                min=Array[i];
            }
        }
        System.out.println("本数组的最小值为"+min);
        System.out.println("本数组的最大值为"+max);
    }
}
