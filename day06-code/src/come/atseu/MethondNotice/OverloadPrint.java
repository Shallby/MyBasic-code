package come.atseu.MethondNotice;
//byte short int long
/*
float double char
boolean

println方法其实就是进行了多种参数的重载 这样打印的时候就直接往里面放我们需要打印的东西
    此方法早已经相应的写好了我们所填充数据类型的重载方法
 */

public class OverloadPrint {
    public static void main(String[] args) {
        MyPrint(1);
        MyPrint(12.2);
    }
    public static void MyPrint(int num){
        System.out.println(num);
    }
    public static void MyPrint(byte num){
        System.out.println(num);
    }
    public static void MyPrint(short num){
        System.out.println(num);
    }
    public static void MyPrint(long num){
        System.out.println(num);
    }
    public static void MyPrint(char num){
        System.out.println(num);
    }
    public static void MyPrint(float num){
        System.out.println(num);
    }
    public static void MyPrint(double num){
        System.out.println(num);
    }
}
