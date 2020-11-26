package Introduce;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
从内存中 将数据写出去到文件中
说明 如果文件名不存在 fileWriter会自动对文件做一个创建
    如果对应的文件是存在的 那么如果是使用的话fileWriter（file）/或者（file，false）是对原有文件的一个内容做一个覆盖
    使用的是(file,true)则是对原有的文件内容做一个追加  不会覆盖之前写的内容
 */
public class FileWriterUse {
    public static void main(String[] args) throws IOException {
        //1.提供File的类对象 指明写出到的文件
        File file = new File("C:\\Users\\Administrator\\Desktop\\JavaCreated\\FileWriter.txt");//写出的文件保存到的地方
        //2.提供FileWriter对象，用于数据的写出
        FileWriter fw = new FileWriter(file,false);//这里的两个参数 第一个是指的是输出的文件名 或者是地址  第二个参数针对的是选择对文件内容的一个覆盖还是追加操作
        //3.写出的操作
        fw.write(" I hava a dream!");
        fw.write(" You  also need a dream too!");

        //流资源的关闭
        fw.close();
    }
}
