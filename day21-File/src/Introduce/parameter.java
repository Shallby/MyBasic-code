package Introduce;
import java.io.File;
/*
    static String pathSeparator 这个是与系统有关的路径分隔符，为了方便，他被表示为一个字符串
路径：
    绝对路径：是一个完整的路径
              以盘符C:  D:等等类似的开始的就是绝对路径 C:\Users\Administrator\Documents\Tencent Files\1012437497
    相对路径：是一个简化的路径
              相对当前的根目录    如果使用当前项目的根目录   路径可以简化书写  根目录\\a.txt  这样就可以省略项目的根目录
注意：
    1.路径是不区分大小写的
    2.路径中文件分隔符是\\  一个\代表的是转义字符  只有两个反斜杠\\才是一个分隔符的意思    这是书写代码的时候要这样子操作
 */
public class parameter {
    public static void main(String[] args) {
        System.out.println(File.pathSeparator);// ;是一个静态成员变量  路径分隔符
        System.out.println(File.separator);//  \  文件名称分隔符   windows系统和linux系统中的不同 后者是一个/正斜杠
                                            //     由于不知道具体程序应用到什么系统是  所以以后不能够把程序写死了 c:\develop\a\a.txt windows
                                               //c:/develop/a/a.txt   linux  最好是"C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"
        /*
        File类的构造方法
        */
        //show1();
        //show2("c：","a.txt");
        show3();
    }
/*
    get length是返回的是文件的大小  文件夹是没有大小的
 */
    private static void show3() {
        File f1 = new File("C:\\Users\\Administrator\\Desktop\\1000.bwp");
        System.out.println(f1.length());//获取的就是桌面已经有的一个文件的大小
        System.out.println(f1.exists());//exists方法是用来判断是否存在文件
        File f2 = new File("C:\\Users\\Administrator\\Desktop\\wahah");
        System.out.println(f2.exists());//false因为这是一个压根就不存在的文件夹
        System.out.println(f1.isFile());
    }

    /*
        File(String parent,String child) 根据parent路径名字符串和child路径名字符串创建一个新的新file实例
        参数：把路径分为了两部分
        一部分叫父路径
        一部分叫子路径
        好处：父路径和子路径可以单独书写 使用起来非常的灵活 父路径和子路径都可以变化
     */
    private static void show2(String s, String s1) {
        File file = new File(s, s1);
        System.out.println(file);
        System.out.println(file.getAbsolutePath());
    }

    /*
    File（String pathname）将通过指定的路径字符串转换为抽象路径名来创建一个新File实例/
        参数：
            String pathname：字符串的路径名称
            路径可以是以文件结尾 也可以是文件夹结尾
            路径可以是相对路径 也可以是绝对路径
            路径可以是存在的 也可以是不存在的
            创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况  也就是时间上并没有打开 也没有查阅已经存在的东西的内部
     */
    private static void show1() {
        File file = new File("C:\\Users\\Administrator\\Desktop\\My_first_File");
        //System.out.println(file);//重写了Object类的toString方法 C:\Users\Administrator\Desktop\My_first_File打印的是一个路径
        System.out.println(file.getAbsolutePath());
        File file1 = new File("a.txt");
        System.out.println(file1.getName());
        //System.out.println(file1.getAbsolutePath());
    }
}
