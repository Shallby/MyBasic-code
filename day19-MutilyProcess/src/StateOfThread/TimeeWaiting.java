package StateOfThread;
/*
    进入到TimeWaiting(计时等待)有两种方式
    1.使用sleep（）方法，在毫秒值结束之后，线程睡醒进入到Runnable/Blocked状态
    2.使用wait（long m）方法，wait方法在毫秒值结束之后，还没有被notify唤醒就会自动醒来，线程睡醒进入到Runnable/Blocked状态
 */
public class TimeeWaiting {
    public static void main(String[] args) {
        //创建锁对象 并且为一
        Object obj = new Object();
        //创建一个顾客线程
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒的线程只有一个执行，需要使用到同步技术
                while (true){
                    synchronized (obj){
                        System.out.println("顾客：我要10个肉包");
                        try {
                            obj.wait();//注意调用锁对象的wait方法  注意是有异常的 要用异常处理机制
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客：啊哈 包子已经来了，那我开始吃咯");
                        System.out.println("******************************");
                    }
                }

            }
        }.start();
        //创建一个顾客线程
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒的线程只有一个执行，需要使用到同步技术
                while (true){
                    synchronized (obj){
                        System.out.println("顾客2：我要10个肉包");
                        try {
                            obj.wait();//注意调用锁对象的wait方法  注意是有异常的 要用异常处理机制
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客2：啊哈 包子已经来了，那我开始吃咯");
                        System.out.println("******************************");
                    }
                }

            }
        }.start();
        //创建一个老板线程
        new Thread() {
            @Override
            public void run() {
                while (true){
                    try {
                        System.out.println("老板：我要花了5秒做包子");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("老板：顾客起来吃包子了");
                        obj.notifyAll();//调用锁对象的notifyAll方法 会唤醒所有的
                    }
                }

            }
        }.start();
    }
}
