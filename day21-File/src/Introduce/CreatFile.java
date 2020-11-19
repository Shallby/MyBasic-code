package Introduce;

import java.io.File;
import java.io.IOException;

/*
利用File类创建文件以及文件夹
 */
public class CreatFile {
    public static void main(String[] args) throws IOException {
        //show1();
        show2();
    }
    /*
    这是方法是用来创建文件夹 不能用来创建文件  注意  如果根据路径名没有找到文件  那么这个mkdir等方法就会创建  有的话就不会创建了
     */
    private static void show2() throws IOException {
        File d1 = new File("C:\\Users\\Administrator\\Desktop\\JavaCreated");
        boolean b = d1.mkdir();//创建单级文件  不管名称是什么 最后都肯定是创建的是一个文件夹  也不会去管名字
        System.out.println("单级文件夹是否创建？" + b);

        File d2 = new File("C:\\Users\\Administrator\\Desktop\\JavaCreated\\Second");
        boolean b2 = d2.mkdirs();//创建多级文件
        System.out.println("多级文件夹是否创建？" + b2);
        //创建好了文件夹 我还要创建一个文件  用的是匿名类创建的
        new File("C:\\Users\\Administrator\\Desktop\\JavaCreated\\JavaCreated.txt").createNewFile();//文本文件
        new File("C:\\Users\\Administrator\\Desktop\\JavaCreated\\JavaCreated.jpg").createNewFile();//jpg图片文件
        //创建好多级文件夹之后 我还在里面创建了一个文本文件
        new File("C:\\Users\\Administrator\\Desktop\\JavaCreated\\Second\\JavaCreated.txt").createNewFile();//文本文件
        new File("C:\\Users\\Administrator\\Desktop\\JavaCreated\\Second\\JavaCreated2.txt").createNewFile();//文本文件

    }

    private static void show1() throws IOException {
        File file = new File("C:\\Users\\Administrator\\Desktop\\JavaCreated.txt");
        boolean newFile = file.createNewFile();
        System.out.println("newFile" + newFile);
        System.out.println(file.getAbsolutePath());

        File file1 = new File("JavaCreated2.txt");
        boolean B = file1.createNewFile();
        System.out.println("JavaCreated2.txt" + B);
        System.out.println(file1.getAbsolutePath());
    }
}
