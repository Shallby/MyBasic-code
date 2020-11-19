package TotalFileSystem;

import java.io.File;

/*
只要java后缀名结尾的文件
那么就需要先用一个String对象来装得到的返回值 同时还需要使用到endsWith方法做一个判断
 */
public class FileForJava {
    public static void main(String[] args) {
        File Target_file = new File("C:\\Users\\Administrator\\IdeaProjects\\MyBasic-code");
        show(Target_file);
    }

    private static void show(File target_file) {
        File[] Array_Files = target_file.listFiles();//得到所有的目录一个数组
        for (int i = 0; i < Array_Files.length; i++) {
            if (Array_Files[i].isDirectory()==true){
                show(Array_Files[i]);
            }else{
                //为了实现只要.java文件 就要使用到String类中的一个方法endsWith判断是否是.java结尾
                String s=Array_Files[i].getAbsolutePath();
                if (s.endsWith(".java")==true||s.endsWith(".JAVA")){
                    System.out.println(Array_Files[i]);
                }
            }
        }
    }
}
