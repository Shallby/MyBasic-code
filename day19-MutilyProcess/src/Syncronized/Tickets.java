package Syncronized;
/*
实现卖票案例
 */
public class Tickets implements Runnable{
    //定义一个多线程共享的票源
    private int ticket=100;

    //创建一个锁对象
    Object obj=new Object(); //这个锁对象将是大家公用的 因为这是一个接口的实现类 用这个来创建的对象是一口气作为了target创建了三个线程

    //设置线程任务：卖票
    @Override
    public void run() {
        //使用循环让卖票操作重复
        while(true){
            synchronized (obj){//这里必须要用到一个锁对象
                if (ticket>0){
                    //提高安全问题出现的概率  这不仅会出现卖同一张票  还会出现-1票
                    try {
                        Thread.sleep(10);//当执行到sleep方法会导致失去对cpu的执行权
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket-=1;//卖票
                }
            }
        }
    }
}
