package Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
解决线程安全的第三种方法
    使用Lock锁 是一个接口  比synchronized方法更高级
Lock接口使用方法：
    void Lock（）
    void unLock（）
    1.在成员位置创建一个ReentrantLock 对象
    2.在可能出现安全问题的代码前调用Lock接口中的Lock获取锁
    3.在可能出现安全问题的代码前调用Lock接口中的unLock获取锁
 */
public class LockIntroduce implements Runnable {
    //定义一个多线程共享的票源
    private int ticket=100;
    //1在成员位置创建一个ReentrantLock对象
    Lock lock1= new ReentrantLock();
    //设置多线程任务 卖票

    @Override
    public void run() {
        //使用死循环 让卖票操作重复进行
        while(true){
            //2.在可能出现安全问题的代码前调用Lcok接口的实现类中的方法Lock获取锁
            lock1.lock();
            //先判断票是否存在
            if(ticket>0){
                //提高安全问题出现的概率 让程序睡眠
                try {
                    Thread.sleep(10);
                    //票存在，卖票 ticket--
                    System.out.println(Thread.currentThread().getName() + "----->正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //3.在可能出现问题的代码后面加上unlock 把锁还回去
                    lock1.unlock();
                }
            }
        }
    }
}
