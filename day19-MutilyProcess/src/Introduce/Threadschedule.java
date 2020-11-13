package Introduce;
/*
线程调度
    1.分时调度
      所有线程轮流使用cpu 平均分配每个线程占用cpu的时间
    2.抢占式调度
      优先让优先级高的线程使用cpu 如果线程的优先级相同 那么就会随机选择一个线程   java使用的是抢占式调度
主线程
    执行main方法的线程

    单线程程序：程序中只有一个线程程序从main方法 开始 从上至下一次执行

 */
public class Threadschedule {
    //这就是一个单纯的单线程程序 从main方法
    // jvm执行会想main方法进入到内存中来 jvm会找操作系统 开辟一条main方法通向cpu的路径  这个路径就是线程  main（主）线程
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();
        System.out.println(0 / 0);//就会出现一个数学异常
        Person p2 = new Person("小王");//Exception in thread "main" java.lang.ArithmeticException:
        p2.run();//单线程后面的程序就无法执行了  所以最好是一个线程执行小强的 一个线程执行小王的
    }
}
