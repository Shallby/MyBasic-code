package come;

public class MATH {
    public int Sum(int[] Array){
        int sum_result=0;// 局部变量的调用首先需要提前赋值
        for (int i = 0; i < Array.length; i++) {
            sum_result+=Array[i];
        }
        return  sum_result;
    }
    public int Max(int[] Array){
        int max=Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (max<Array[i]){
                max= Array[i];
            }
        }
        return max;
    }

}
