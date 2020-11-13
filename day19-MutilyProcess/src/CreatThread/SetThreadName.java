package CreatThread;
/*
  设置线程的名称（了解）
    1.使用Thread类中的setName
       void setName
    2.创建一个带参数的构造方法，参数传递线程名称 调用父类的带参构造方法  让父类（Thread）给子类线程起一个名字
       Thread（String）分配新的Thread对象
  */
public class SetThreadName {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 0; i <=60 ; i++) {
            System.out.println(i);
            //使用Thread类中的sleep方法让程序睡眠一秒钟
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}
