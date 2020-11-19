package Lock;

import SafetyOfThread.Tickets;

public class LockInterfaceSafe {
    public static void main(String[] args) {
        LockIntroduce tickets = new LockIntroduce();//接口的实例 创建了一个接口的实现类 并将这个实现类作为target放入到了Thread构造器中 创建了三个对象
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
