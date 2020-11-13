package Introduce;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
Throwable中定义了三个异常处理方法
    1.String getMessage（）返回此throwable的简短描述。  这里的简短描述是指在抛出指定异常对象时自己所做的描述
    2. String toString（） 返回此 throwable的详细信息字符串
    3. void printStackTrace JVM打印异常对象，默认此方法 打印信息是最全面的
 */
public class Throwable {
    public static void main(String[] args)  {
        try{
//            readFile("c:\\a.txt");//注意 这里是正确的 没有任何异常
            readFile("c:\\a.txtt");
        }catch (IOException E){//这里的E是一个对象名的意思 看有可能产生对象部分的代码会产生一个什么异常对象
            //try中抛出什么异常对象
            // catch就捕获到了对应的异常对象
//            System.out.println("不是一个正确的路径文件");  //这是我自己写的异常处理逻辑 也可以直接使用java自带的三种异常处理方法
            System.out.println(E.getMessage());//必须要在catch中输入E才可以 因为这个E是一个局部变量 就只能在这个方法中存在 出去了就不找不到了
            System.out.println(E.toString());//这也是第二种异常处理方法
            E.printStackTrace();//这是第三种异常处理方法  这是jvm虚拟机自己处理采取的方式  就是打印出来 然后还把程序给中断了  就此结束

        }
        System.out.println("****************************************");
        System.out.println("我是李元勋  这是异常之后的代码");
        System.out.println("我的代码没有中断程序 而是靠自己解决了问题哦");
    }

    public static void readFile(String fileName) throws IOException {//这里加上这一句话是因为 在这个方法里 自己依旧是没有处理 让方法的调用者 这里是main作为调用者
        //如何去处理这个编译异常呢？ 在方法的声明出添加上throws FileNotFoundException
        if(!fileName.equals("c:\\a.txt"))
            throw new FileNotFoundException("传递的文件路径不是C：\\a.txt");//这个是一个编译异常 需要解决  FileNotFoundException是编译异常 一种编译异常
        /*
        如果传递的路径不是.txt结尾 就抛出IO异常 告知方法的调用者 文件的后缀名不正确
         */
        if(!fileName.endsWith(".txt")){
            throw new IOException("路径名不是.txt结尾");
        }
        System.out.println("路径没有问题 可以打印");
    }
}


