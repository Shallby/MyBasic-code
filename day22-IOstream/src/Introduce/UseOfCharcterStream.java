package Introduce;

import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;

/*
    将文件内容读入进来

    说明：
    1.read()的理解：返回读入的一个字符。如果达到文件末尾，返回-1
    2.异常处理：为了保证流资源的顺利关闭并且不占用系统资源 必须要将异常处理  同时保证一定要关闭流 需要使用try catch finally
    3.数据的读入一定要存在 否则就会报出FilenotFoundException
 */
public class UseOfCharcterStream {
    public static void main(String[] args) {
        FileReader fr = null;//这是自动生成了一个内容

        try {
            //1.实例化File类的对象 指明要操作的文件 放入文件路径
            File file = new File("C:\\Users\\Administrator\\Desktop\\JavaCreated.txt");//使用了绝对路径来找到了文件的位置
            System.out.println(file.length());
            //2.提供具体的流
            fr = new FileReader(file);
            //3.读入文件内容
            //read()返回读入的一个字符 如果达到文件末尾，返回-1  为了加快读入的速度 我们建议是用一个字符数组 一次读取多个
            char[] cbuf =new char[5];//每次用一个数组来装一次性读入的内容 fr.read()自带着一个迭代器 他可以实现自动的每读一个序号减少一个
            int len;
            while((len= fr.read(cbuf))!=-1){//fr.read(cbuf)这个是将读取到的数据放入了一个cbuf中的缓冲数组之中 并且会返回一个读取了多少次的int数值
                /*
                for (int i = 0; i <len ; i++) {//所以用了一个len的int量用来存每次读取了多少个字符
                    System.out.print(cbuf[i]);
                }*/
                //除了使用数组之外 然后多次循环遍历读取文件内容之外  由于是字符类型的数据 那就可以利用将数组直接转换为一个字符的构造器 但是也是同样要注意len
                String s = new String(cbuf, 0, len);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流  一定要关闭    Jvm不能自动关闭
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
