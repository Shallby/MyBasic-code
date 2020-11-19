package CommunicationOfThread;
/*
1.
    多个线程在处理同一个资源 票 包子  但是处理的动作不同（有的吃 有的做）
因此：当多个线程为了有规律的执行 就需要一些线程之间的协调通信 以此到达多个线程共同操作同一的资源
2.等待唤醒机制
    线程之间除了抢夺cpu的资源之外，还有协作的情况
   等待与唤醒机制就是多个线程之间的协作机制   也称为线程直接的通信
   通信：可以对包子的状态进行判断
       没有包子-->吃货线程唤醒包子铺线程-->吃货线程等待-->包子铺线程做包子-->做好包子-->修改包子状态为有
       有包子-->包子铺唤醒吃货吃包子-->包子铺等待 吃货吃包子-->修改包子状态为无
3.等待唤醒中的几种方法
    1.wait:线程不再活动，不再参与调度，进入wait set中，因此不会浪费cpu的资源，也不会去竞争锁了，这时线程状态就是WAITING。它还
    需要别的线程执行一个特殊的动作，也就是notify  这个线程才能从wait set 中释放出来 重新回到调度队列（ready queue）中
    2.notify：则选取通知对象的wait set中的一个线程释放，例如餐厅有了一个空座位了 可以让等待最久的顾客就餐
    3.notifyAll： 则释放所有线程从wait set中释放

    注意：虽然通知了恢复线程  但是也不会很快就执行   一因为也是需要看cpu是否有空 需要去得到锁之后才能继续
    总结:如果能够获取锁，线程就从WAITING状态变成RUNNABLE状态
    否则，从wait set 出来，又进入entry set 线程就从WAITING 状态到了 BLOCKED状态
4.等待唤醒机制的注意细节
    1.wait方法与notify方法必须要由同一个锁对象调用。因此：对应点的锁对象可以通过notify唤醒使用同一个锁对象调用了wait方法的线程
                notify只会唤醒使用同一个锁对象的线程
    2.wait方法与notify方法是属于Object类的方法。因此：对应点的锁对象可以是任意对象
    3.wait方法和notify方法必须要在同步代码块或者是同步函数中使用，因为：必须要通过锁对象调用这两个方法。



 */
public class Reason {
}
