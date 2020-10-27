package come.atseu.MethondNotice;
/*
对于功能十分相似的方法来说，只是参数列表不同，例如加两个数，加三个数等等 实质内容是没有变的/


方法的重载（Overload）：方法的，名称一致 但是参数列表不一样。
好处：只要记住唯一一个方法名称就可以实现多个类似的功能。方法名称要是不一样了那就不是重载了 直接都换名字了


方法重载与下列因素相关：
    1.参数个数不同
    2.参数类型不同int a换成double a
    3.参数的多类型顺序不同也是方法的重载
方法重载与下列因素无关：
    1.与参数的名称无关
    2.与方法的返回值类型无关  返回值为int 或者是double都是
    3.与方法的修饰符无关，不管是public还是private 或是static均无关 修饰静态 可有可无
 */
public class MehodOverload {
    public static void main(String[] args) {
        System.out.println("第一次的调用"+Sum(1,3));
        System.out.println("第一次的调用"+Sum(1,3,6));//会自动识别 只要你输入的参数是对的 会根据参数个数自己填充并选择相应的方法。
    }
    public static int Sum(int a,int b){
        int i= a + b;
        return i;
    }
//    错误的方法重载，因为方法的重载与参数的名称无关，不能以参数的名称作为判断方法重写与否
//    public static int Sum(int x,int y){
//        return x+y;
//    }
    public static int Sum(int a,int b, int c){
        return  a+b+c;
    }
}
