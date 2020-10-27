package come.atsue.demo01;
import java.text.DecimalFormat;
public class Demo04MathematicHomework {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat( "0.0000000000000000");
        int n =1000000;
        System.out.println("    S函数的精确值="+df.format(S_True(n)));
        System.out.println("从大到小计算S10_6="+ df.format(S_Form_Big_To_Small(n)));
        System.out.println("从小到大计算S10_6="+ df.format(S_Form_Small_To_Big(n)));
    }

    public static double S_True(int n){
        double result;
        result= 0.5*(1.5-(double)1/n-(double) 1/(n+1));
        return result;
    }
    public static float S_Form_Big_To_Small(int n){
        float result = (float) 0.0;
        for(int i = 2; i<=n; i++){
            result+=(float)1/(i*i-1);
        }
        return result;
    }
    public static float S_Form_Small_To_Big(int n){
        float result = (float) 0.0;
        for(int i = n; i>=2; i--){
            result+=(float) 1/(i*i-1);
        }
        return result;
    }
}
