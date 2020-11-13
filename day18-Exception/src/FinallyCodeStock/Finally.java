package FinallyCodeStock;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    finally代码块 使用格式
    格式：
        try{
            可能产生异常的代码
       }catch（定义一个异常变量，用来接收try中抛出的异常对象）{
             异常处理逻辑，异常对象之后，怎么处理异常对象
             一般在工作中，会把异常的信息记录在一个日志中
       }
       ...
       catch（异常类名 变量名）{

       }finally{
        无论发生什么异常对象 这里的代码都要执行  哪怕是没有出现异常对象 这里的代码也都是会处理的
        就是说在可能产生代码这句话之后的 想要处理的程序都应该放在这里
       }
注意：
    1.finally不能单独使用 必须和try catch 一起使用
    2.finally一般适用于资源释放  无论程序是否出现异常 最后都是要资源释放（i，o）
 */
public class Finally {
    public static void main(String[] args)  {
        try{
//            readFile("c:\\a.txt");//注意 这里是正确的 没有任何异常
            readFile("c:\\a.txt");
        }catch (IOException E){//这里的E是一个对象名的意思 看有可能产生对象部分的代码会产生一个什么异常对象
            //try中抛出什么异常对象
            // catch就捕获到了对应的异常对象
//            System.out.println("不是一个正确的路径文件");  //这是我自己写的异常处理逻辑 也可以直接使用java自带的三种异常处理方法
            System.out.println(E.getMessage());//必须要在catch中输入E才可以 因为这个E是一个局部变量 就只能在这个方法中存在 出去了就不找不到了
            System.out.println(E.toString());//这也是第二种异常处理方法
            E.printStackTrace();//这是第三种异常处理方法  这是jvm虚拟机自己处理采取的方式  就是打印出来 然后还把程序给中断了  就此结束

        }finally{
            System.out.println("无论出现了什么异常对象 哪怕是没有出现异常 我这个finally中的代码都已经执行了");
        }
        System.out.println("****************************************");
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
