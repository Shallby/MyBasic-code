package Syncronized;

/*
    一个窗口卖100张票不会出现问题   也就是单线程程序不会出现问题
    100张票如果有三个窗口在卖 如果卖不同段的票 那么也不会出现问题   也就是多线程  如果处理不同的任务 没有访问共享数据 那也不会产生问题
    如果让每个窗口都是从1号卖到100号  那么就有可能出现问题 比如两个窗口都在卖第3号票 那么久会之后都会这3号票卖出去了
 总结：三个窗口卖的票一样的就会出现安全问题
      也就是如果多线程访问共同的数据 那么就会产生线程安全问题

分析：线程安全问题产生的原因 重复的 不存在的票 Thread-0正在卖第-1张票 Thread-1正在卖第100张票 Thread-2正在卖第100张票

结论：我们要避免出现线程安全的问题
    可以让一个线程在访问共享数据的时候，无论这个线程是否因为sleep失去了对cpu的执行权 其余的线程都只能等待
    除非是这个线程已经执行完了
    也就是保证只有一个线程在卖票
 */
public class SafeSynchronizedMethod {
    public static void main(String[] args) {
        SynchronizedMethod tickets = new SynchronizedMethod();//接口的实例 创建了一个接口的实现类 并将这个实现类作为target放入到了Thread构造器中 创建了三个对象
        //注意  为了实现数据的共享 还只能用一个接口的实现类来作为target进行三次实现 这样才是真的是共享的数据 都是以这个票为票源
        Thread t0 = new Thread(tickets);//以这个实例作为target放入Thread中 开启三个线程 t0 t1 t2 一起抢夺cpu的执行权 谁抢到 谁执行
        Thread t1 = new Thread(tickets);//以这个实例作为target放入Thread中
        Thread t2 = new Thread(tickets);//以这个实例作为target放入Thread中
        //这三个线程都是无线循环的任务  多是对同一个变量ticket进行--操作 并打印出来编号而已 正是因为都是对这个变量进行操作  所有就很有可能出现都打印同一张票
        //开启多线程
        t0.start();
        t1.start();
        t2.start();
        System.out.println("卖票大战开始！");
    }
}
