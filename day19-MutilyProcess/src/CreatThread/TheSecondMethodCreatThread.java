package CreatThread;
/*
    除了使用java lang包下的Thread类 还可以使用lang包下的Runnable接口 也是一种非常常见的方法 我们只需重写run方法就行
步骤如下：
    1.定义Runnable接口的实现类，并重写该接口的run（）方法，该方法的方法体仍然是我们想要线程所执行的内容
    2.创建Runnable实现类的实例，并以此实例作为Thread的target  来创建Thread对象，该Thread对象才是真正的线程对象 也就可以调用start方法了
    3.调用线程对象的start（）方法启动线程
利用接口实现
    1.避免了单继承的局限
      一个类只能继承一个类 通过Runnable接口避免了单继承的局限 可以同时实现过个接口有利于代码的丰富性
    2.增强了程序的扩展性 降低了程序的耦合性
        实现Runnable接口的方式，把设置线程任务和开启线程进行了分离
                1.Runnable接口的run方法是设置多线程的任务
                2.利用Thread类的start方法进行调用方法 实现线程的调用  只要传递的接口实现类不一样 那么线程的内容也都是不一样的
注意匿名内部类方式也是可以用于线程的创建
    匿名：没有名字
    内部类：写在其它类的内部
匿名内部类的作用：
    把子类继承父类  重写父类的方法 一步完成
 */
public class TheSecondMethodCreatThread {
    public static void main(String[] args) throws InterruptedException {
        ImplementRunnable implementRunnableInterface = new ImplementRunnable();
        Thread mt= new Thread(implementRunnableInterface);//虽然创建了一个接口实现类的实例对象 但是由于这个对象没有start方法
        new Thread(new NoneNameImplementRunnable()).start();//利用匿名类创建的一个线程 这是一个新的类 同样是实现了Runnable接口的另外一个实现类
        mt.start();                                       //所以需要以此为输入参数放入Thread类的构造方法中  并调用方法
        System.out.println("这是主线程里面的");
        for (int i = 0; i < 20; i++) {
            System.out.println("main："+i);
            Thread.sleep(16);
        }
        System.out.println("我是主线程的尾部程序");//通过对运行结果的对比 发现确实是这样子的   这里明明是主线程语句 可是最后还是运行到了前面去了

        //线程的父类是Thread
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("Thread3匿名内部类" + i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        //线程的接口是Runnable
        Runnable r=new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("Thread4接口的匿名内部类"+i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };//由于接口Start方法 只有一个run方法 所以就要想办法来利用多态 将这个对象作为Thread其中的一个构造器的输入参数
        new Thread(r).start();//将刚刚创建的接口对象作为参数传入构造器中去  甚至为了代码的简单可以将这些全部都传进来
    }
}
