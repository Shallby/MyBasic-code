package CopyFunction;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
将文件读取进来然后写出去
 */
public class Copy {
    public static void main(String[] args) {
        FileReader fr = null;//这个也是由于异常处理用的try catch finally 自动生成的内容
        FileWriter fw = null;
        try {
            //1创建文件对象
            File file = new File("C:\\Users\\Administrator\\Desktop\\JavaCreated\\Copy\\read.txt");
            File file1 = new File("C:\\Users\\Administrator\\Desktop\\JavaCreated\\Copy\\write.txt");
            //2创建流对象
            fr = new FileReader(file);
            fw = new FileWriter(file1);
            //3数据的读入和写出操作
            char[] Cbuf =new char[5];
            int len;
            while((len=fr.read(Cbuf))!=-1){
                fw.write(Cbuf,0,len);//注意 这里是将文件的内容读取了之后放入了一个Cbuf数组里面 然后直接用了文件输出流FileWriter将文件做了一个输出到了另外的一个文件中去
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4关闭流
            try {
                if (fr!=null|fw!=null){
                    fr.close();
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
