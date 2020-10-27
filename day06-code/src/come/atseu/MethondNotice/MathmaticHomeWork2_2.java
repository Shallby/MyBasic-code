package come.atseu.MethondNotice;

public class MathmaticHomeWork2_2 {
    public static void main(String[] args) {
        System.out.println("函数在x=1出的导数值为"+Function_diff(1));
        double a=0,b=5;
        double e=0.000001;//误差容忍度
        double x,x_bar;

        do{
            x=b;
            x_bar=x-Function(x)/Function_diff(x);
            if(x_bar<b&&x_bar>a){
                x_bar=x-Function(x)/Function_diff(x);
            }else{
                x_bar=(a+b)/2;
            }
            if(Function(x_bar)<0){
                b=x_bar;
            }else{
                a=x_bar;
            }
        }while(Math.abs(Function(x_bar))>e);
        System.out.println("该函数在[0,4]的根为"+x_bar);
    }

    public static double Function(double x){
        double result;
        result=Math.sin(x);
        return result;
    }//原函数

    public static double Function_diff(double x){
        double deltax=0.0000001;
        double deltay = Function(x + deltax) - Function(x);
        return deltay/deltax;
    }//导函数
}
