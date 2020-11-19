package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
使用线程池的步骤
    java.util.concurrent.Executors:线程池的工厂，用来生产线程池
    Executors类中的静态方法：
        static ExecutorService newFixedThreadPool(int nThreads)创建一个可重同固定线程的线程池
        参数：
            int nThreads 线程池中包含的线程数量
        返回值：
            ExecutorService接口，返回的是ExcutorService接口的实现类对象，我们可以使用ExecutorService接口接收（面向接口编程）多态
    注意：ExecutorService接口中有一个方法 叫submit（Runnable task） 是从线程池中找一个线程 并提交一个Runnable任务用于执行 并返回一个表示该任务的参数



 */
public class MyFirstThreadPool {
    public static void main(String[] args) {
        //创建一个线程池：
        ExecutorService MyThreadPool = Executors.newFixedThreadPool(10);//用了一个接口接收了对象
        //2实现Runnable接口的，重写run方法 设置线程任务
        //3调用ExecutorService中的方法submit，传递线程任务（实现类）开启线程，执行run方法
        MyThreadPool.submit(new Runnableimpl());//注意这里有10线程在MyThreadPool线程池中  由于只是调用了一次任务 所有剩余的9个线程都没有用上去
        //线程池会一直开启  使用完了线程会自动把线程归还给线程池 所以这个线程可以继续使用 有可能多次出现
        MyThreadPool.submit(new Runnableimpl());//注意这里有10线程在MyThreadPool线程池中  由于只是调用了一次任务 所有剩余的9个线程都没有用上去
        MyThreadPool.submit(new Runnableimpl());//注意这里有10线程在MyThreadPool线程池中  由于只是调用了一次任务 所有剩余的9个线程都没有用上去
        //4调用ExecutorService中的shutdown销毁线程池 但是不建议这么做 因为这样就会将这个线程池彻底删除
        System.out.println("线程池调用完毕");
    }
}
