package StateOfThread;
/*
    等待唤醒案例：线程之间的通信
        创建一个顾客线程：告诉老板要什么 调用wait方法进入WAITING状态 无限等待
        穿件一个老板线程：花了5秒 做好之后调用notify方法，唤醒顾客吃包子
    注意：
        顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
        同步使用的锁对象必须保证唯一
        只有锁对象才能调用wait和notify方法

     Object类中的方法
     void wait（）
        在其他线程调用此对象的notify方法或notifyAll方法前，导致当前线程等待。
     void notify（）
        唤醒此对象监视器上等待的单个线程
        会继续执行wait方法之后的代码
 */
public class Waiting {
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
                        obj.notify();//调用锁对象的notify方法 唤醒另外一个线程
                    }
                }

            }
        }.start();
    }
}
