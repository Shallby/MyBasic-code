package ForMenu;

import java.io.File;

/*
    File类遍历文件夹目录的功能
    -public String[] list（）；返回一个String数组，表示该File目录中的所有子文件或目录 这个数组会保存所有名称
        要注意：如果对象的路径不是一个目录而是一个文件 或路径不存在 那么就会出现NullPointerException:异常
    -public File[] listFiles（）：返回一个File数组，表示该File目录中的所有子文件或目录  这个数组存储的是File的文件路径
 */
public class For {
    public static void main(String[] args) {
        show1();
    }

    private static void show1() {
        File filefor = new File("C:\\Users\\Administrator\\Desktop\\JavaCreated");
        //File filefor = new File("C:\\Users\\Administrator\\Desktop\\JavaCreated\\JavaCreated.txt");
        String[] Array = filefor.list();
        File[] Array2 = filefor.listFiles();
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
        System.out.println("*******************");
        for (int i = 0; i < Array2.length; i++) {
            System.out.println(Array2[i]);
        }
    }
}
