package CreatThread;
/*
直接调用run方法与调用start方法是不一样的

main方法首先压栈执行   首先执行是创建t1对象 对象的内容是在堆内存里 保存了十六进制的地址值
这里如果调用run方法 那么实际上是一个单线程  是通过main线程调用了一个对象t1的run方法而已 这和调用普通法没有区别

而调用start方法  那么就是开辟一个新的线空间  在新的空间里执行run方法

对于cpu而言 他就有了选择的权利 他可以随机选择任意的空间里面的方法去执行
 */
public class MemoryOfMulity {
    public static void main(String[] args) {
        ThreadExtends t1 = new ThreadExtends();
        ThreadExtends t2 = new ThreadExtends();
        t2.start();//加上了这一句之后这就是一个多线程  有两个线程 一个main线程一个另外的线程
        t1.run();
        System.out.println("main线程开始了");//这个方法实际上执行的是一个单线程
    }
}
