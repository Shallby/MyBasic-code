package ForMenu;

import java.io.File;

/*
    打印桌面的一个文件夹里面的所有东西  这里的这个程序可以实现对本电脑的所有文件夹都做一个打印 打印文件夹厘米那的所有文件
 */
public class RecurisonForMenu {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\JavaCreated");
        //File file = new File("C:\\Program Files (x86)");
        /*
        获取所有的文件
         */
        //show(file);
        //System.out.println("*************************");
        show2(file);
    }

    /*
    利用递归 先对输入参数进行判断是不是文件夹  是的话就调用show 不是的话就直接打印
     */

    private static void show2(File dir) {
        File[] files = dir.listFiles();
        for (File f:files){//这是一个增强for循环
            if(f.isDirectory()==true){//这里就用到了递归的判断条件
                show2(f);
            }else {
                System.out.println(f);//会使用迭代的是人，会用递归的是神
            }
        }
    }

    /*
    事实上 这个成员方法并没有实现将所有的文件都答应出来 有些文件没有打开看
     */
    private static void show(File dir) {
        File[] files = dir.listFiles();
        for (File f:files){//这是一个增强for循环
            System.out.println(f);
        }
    }
}
