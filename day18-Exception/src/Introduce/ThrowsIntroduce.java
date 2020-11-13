package Introduce;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    throw关键字只是抛出来了 但是没有真正的去处理
throws是异常处理的第一种方法，交给别人处理
    作用：
        当方法内部抛出异常对象的时候，那么我们就必须处理这个异常对象
        可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法调用者 自己不处理 给别人处理 最终交给jvm处理 而jvm处理方式就是中断程序
     使用格式：在方法声明时使用
        修饰符  返回值类型 方法名（参数列表） throws AAAException ，BBBException{
            throw new AAAException（”产生的原因“）
            throw new BBBException（”产生的原因“）
        }
     注意：
        1.throw关键字必须写在方法的声明出
        2.throw关键字后边声明的异常必须是Exception或是其子类
        3.方法内部如果抛出了多个异常对象，那么throws后边必须也声明多个异常（就是方法提里面提出了多少种可能的Exception 那么在声明方法的时候也必须要声明）
              如果抛出的多个异常对象有子父类关系 那么直接声明父类就行
        4.调用了一个声明抛出异常方法，我们就必须处理异常声明
            要么继续使用throws声明抛出，交给方法调用者，最终交给jvm
            要么try  catch自己处理
 */
public class ThrowsIntroduce {
    public static void main(String[] args) throws IOException {
        readFile("c:\\a.tx");//这里只还是红的原因是因为还没有解决问题 可以继续声明  自己还没有处理 通过继续声明 让jvm去处理  也可以通过使用try catch自己处理
    }
    /*
    定义一个方法，对传递的文件路径进行合法性判断
    如果路径不是”C：“\\a.txt
        FileNotFoundException是一个编译异常  抛出了编译异常就必须处理
        可以使用throws继续声明抛出FileNotFoundException 让方法的调用者  也就是最终是jvm去中端程序
     */
    /*
    事实上 FileNotFoundException 是IoException的子类 可以直接声明父类的声明就行 前面的可以不用声明
          各种异常都是Exception的子类。
     */
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
