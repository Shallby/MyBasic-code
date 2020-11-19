package ThreadPool;

public class Runnableimpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"这是线程的任务 就是打印名字");
    }
}
