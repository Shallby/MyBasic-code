package come.atseu.MethondNotice;

public class MathmaticHomeWork2 {
    double e=1;//容忍误差限
    public static void main(String[] args) {
        double a=0.006,b=4,c= 2;;
        double e=0.00000001;//容忍误差限,此值的大小决定了最终求得的结果正确与否。
        /*
        试值法的方法体
         */
        while (Math.abs(Function(c))>e){
            c = b - (((b - a) / (Function(b) - Function(a))) * Function(b));
            if(Function(a)*Function(c)>0){              //判断符号
                a=c;                                    //重新划分根所在的区间
            }else{
                b=c;
            }
        }
        System.out.println("根据试值法确定出该函数在[0,4]的根为"+c);
    }

    public static double Function(double x){
        double result;
        result= Math.sin(x);
        return result;
    }

}
