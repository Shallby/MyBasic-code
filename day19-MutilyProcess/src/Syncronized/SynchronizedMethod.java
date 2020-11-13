package Syncronized;
/*
解决安全问题的第二种方法：使用同步方法
格式
    1. 修饰符 synchronized 返回值类型 方法名（参数列表）{
        可能出现线程安全问题的代码 （共享数据）
    }
 */
public class SynchronizedMethod implements Runnable {
        //定义一个多线程共享的票源
        private int ticket=100;

        //设置线程任务：卖票
        @Override
        public void run() {
            //使用循环让卖票操作重复
            while(true){
            SellTickets();
            }
        }
        /*
        定义一个同步方法
        同步方法也会把方法内部的代码块锁住
        只让一个线程能够执行这个方法
        同步方法的锁对象实际上也就是this。。。谁调用这个方法 谁就是锁对象 在这里就是Synchronized  也就是线程实现类
         */
        public synchronized void SellTickets(){
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
