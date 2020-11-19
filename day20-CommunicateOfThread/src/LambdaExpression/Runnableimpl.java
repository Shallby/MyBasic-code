package LambdaExpression;

public class Runnableimpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"标准的面向对象方法");
    }
}
