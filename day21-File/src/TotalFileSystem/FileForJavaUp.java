package TotalFileSystem;

import java.io.File;
import java.io.FileFilter;

/*
只要java后缀名结尾的文件
那么就需要先用一个String对象来装得到的返回值 同时还需要使用到endsWith方法做一个判断

使用文件过滤器实现筛选 File类中有两个和file_lists重载的方法
java.io.FileFilter接口：
File[] listFiles(FileFilter filter)
    作用：用来过滤文件的抽象方法 需要先实现 boolean accept (File pathname)
    实际上就是使用file.listFiles遍历得到的所有对象
 */
public class FileForJavaUp {
    public static void main(String[] args) {
        File Target_file = new File("C:\\Users\\Administrator\\IdeaProjects\\MyBasic-code");
        show(Target_file);
    }

    private static void show(File target_file) {
        FileFilter fileFilterImpl = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return true;
            }
        };
        File[] Array_Files = target_file.listFiles(fileFilterImpl);//先使用fileFilter接口中的一个抽象方法  注意这个方法已经被我实现了
        for (int i = 0; i < Array_Files.length; i++) {
            System.out.println(Array_Files[i]);
        }
    }
}
