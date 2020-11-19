package LambdaExpression;
/*
一方面匿名内部类可以帮助省去实现类的定义；另一方面 匿名内部类的语法有点复杂

Lambda标准表达式分为三部分
    1.一些参数
    2.一个箭头
    3.一段代码
    (参数类型 参数名称)->{方法体   代码语句}
  格式说明：
    小括号内的语法与传统方法参数列表一致：无参数则留空：多个参数就用逗号分离
    ->这是一个整体的新引入的语法格式 代表指向动作
    大括号内的语法与传统方法要求基本一致。
 */
public class Lambda {
    public static void main(String[] args) {
        //使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {//这个方法体没有输入参数 没有返回值
                System.out.println(Thread.currentThread().getName() + "Lambda的编程思想");///这是目的所在 就是通过多线程实现功能的实现
            }
        }).start();///回归到本质上 将关注点放在做什么本质上来

        //使用lambda
        new Thread(()->{//（）表示run方法的参数  ->表示的是
            System.out.println(Thread.currentThread().getName()+"直接使用lambda表达式,将方法体直接发给多线程去启动 连Runnable接口都没有关心");
        }
        ).start();
    }
}
