package Introduce;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    throws实际上只是声明了异常  是交给了jvm进行中断 不管程序有咩有执行完 而try catch依旧是会处理后面的代码
    后面那怕还是有很多代码都是没有办法去处理的
try 。。。catch:异常处理第二种方法
    格式：
        try{
            可能产生异常的代码
       }catch（定义一个异常变量，用来接收try中抛出的异常对象）{
             异常处理逻辑，异常对象之后，怎么处理异常对象
             一般在工作中，会把异常的信息记录在一个日志中
       }
       ...
       catch（异常类名 变量名）{

       }
    注意：1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
         2.如果try中产生了异常，那么就会执行catch中的异常处理罗比，执行完毕之后就会继续执行之后的代码
         3.如果try中没有产生异常  那也就不会执行catch中的异常处理逻辑 ，依旧会继续处理之后的代码
 */
public class TryCatchException {
    public static void main(String[] args)  {
        try{
            readFile("c:\\a.txtt");
        }catch (IOException E){//这里的E是一个对象名的意思 看有可能产生对象部分的代码会产生一个什么异常对象
            //try中抛出什么异常对象
            // catch就捕获到了对应的异常对象
            System.out.println("不是一个正确的路径文件");
        }
        System.out.println("我是李元勋  这是异常之后的代码");
        System.out.println("我的代码没有中断程序 而是靠自己解决了问题哦");
    }

    public static void readFile(String fileName) throws IOException {//这里加上这一句话是因为 在这个方法里 自己依旧是没有处理 让方法的调用者 这里是main作为调用者
        //如何去处理这个编译异常呢？ 在方法的声明出添加上throws FileNotFoundException
        if(!fileName.equals("c:\\\\a.txt"))
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

