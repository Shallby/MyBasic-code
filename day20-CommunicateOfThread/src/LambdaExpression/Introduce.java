package LambdaExpression;
/*
lambda函数式编程思想  就是拿什么东西做什么事情   强调是自己去做  只要能获取到结果就可以  谁去做的以及怎么做的都不重要 重视的是结果 不重视过程
面向对象是要找一个能解决一个事情的对象 并调用对象的方法来实现具体的功能

lambda思想打开了编程的大门
 */
public class Introduce {
    public static void main(String[] args) {
        //利用Runnable接口的实现类 创建一个对象
        Runnableimpl run = new Runnableimpl();
        //创建Thread类对象 并将run对象作为参数放入到Thread的构造器中
        Thread thread = new Thread(run);
        //调用start方法开启新线程 执行run方法
        thread.start();



        //对与相同的功能可以稍微简化一下
        Object obj=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "这是简化版的方法");
            }
        };
        new Thread((Runnable) obj).start();

        //彻底简化  这里省去了很多东西 比如   省略了对象的创立  关键所在是方法体
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "Lambda的编程思想");///这是目的所在 就是通过多线程实现功能的实现
            }
        }).start();///回归到本质上 将关注点放在做什么本质上来
    }
}
