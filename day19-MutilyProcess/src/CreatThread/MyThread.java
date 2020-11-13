package CreatThread;
/*
java中使用java.lang.Thread类表示线程 所有线程对象都是Thread类或者其子类的实例
  java通过继承Thread类来创建并启动多线程的步骤
    1：定义Thread类的子类 并重写该类的run（）方法 ，该方法的方法体 就代表了这个线程需要完成的任务 run（）方法又称为线程执行体
    2：创建Thread子类的对象
    3：调用线程对象的Start（）方法来启动该线程
注意：java属于抢占式的cpu调度 优先级高的先执行

 */
public class MyThread {
    public static void main(String[] args) {
        System.out.println("main:这里有三个线程，一个main主线程和两外的两个专门去实现输出的线程");
        //创建Thread子类ThreadExtends的对象
        ThreadExtends t1 = new ThreadExtends();
        t1.start();
        //主线程中执行的代码
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
        //实际上这确实是多线程 因为打印文字的输出在最前面 这和单线程不一样
    }
}
