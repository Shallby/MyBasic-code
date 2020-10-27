package come.atsue.demo01;
/*
有参数：小括号里面有内容 调用的时候必须要往里面放入相应的值 才能正确的调用

无参数：小括号留空，自己就能完成
 */
public class Demo03MethodParam {
    public static void main(String[] args) {
        method1();
        method2(10,8);
    }
    public static void method1(){
        int result =10*8;
        System.out.println("无参数"+result);
    }
    public static int method2(int a,int b){
        int result =a*b;
        System.out.println("有参数"+result);
        return result;
    }
}
