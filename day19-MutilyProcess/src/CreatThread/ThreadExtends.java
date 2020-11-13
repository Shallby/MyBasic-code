package CreatThread;

public class ThreadExtends extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread:"+i);
            System.out.println(Thread.currentThread());//打印当前的线程
        }
    }
}

