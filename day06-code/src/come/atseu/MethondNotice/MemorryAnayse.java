package come.atseu.MethondNotice;
/*
java的内存需要被划分为5部分 方法的运行一定要在栈中运行
1.栈 (Stack):存放的都是方法中的局部变量。
    局部变量：方法的参数，或者是方法{}中的变量
    作用域：一旦超出作用域，立刻从栈中消失
2.堆（Heap）：凡是new出来的都是在堆中
    都拥有地址值 都是十六进制的
    都有默认值 0，0.0，‘|u0000’，null
3.方法去Method：存储.class相关信息，死信息 真正的方法都是在运行在栈中

4.本地方法栈（native Method Stack）：与操作系统有关。
5.寄存器（register）：与cpu有关。

 */
public class MemorryAnayse {
    public static void main(String[] args) {
        int[] Array1=new int[4];//动态初始化
        System.out.println(Array1);//数组地址值
        System.out.println(Array1[0]);//0
        System.out.println(Array1[1]);//0
        System.out.println(Array1[2]);//0
        //改变数组中的内容
        Array1[0]=12;
        Array1[1]=232;
        System.out.println(Array1[0]);//0
        System.out.println(Array1[1]);//0
        System.out.println(Array1[2]);//0
        System.out.println(Array1);//数组地址值
    }
}
