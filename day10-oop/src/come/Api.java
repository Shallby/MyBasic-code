package come;
/*
Api文档的使用三步走
 1.看包
 2.看构造器
 3.看普通的成员方法
例子 scanner类的使用 scanner类的功能：实现键盘的输入到程序中来

这个类是jak已经提供好的 Api是一本字典 告诉我们怎么使用
    引用类型的一般使用步骤：
    1.倒包 import 包路径.类名称;如果目标类与当前类在同一个路径下就可以不用导入
                             还有java。lang包下的类也不需要导入包
    2.创建 类名称 对象名 =new 类名称（参数。。。。）；

    3.使用 对象名.成员方法名（参数。。。。）；
 */
import java.util.Scanner;//导包
public class Api {
    public static void main(String[] args) {
        //2.创建 要在main方法里面  System.in 表示从键盘导入 暂时的 输入就是只有这一个
        Scanner sc=new Scanner(System.in);

        //3.使用 Scanner类的成员方法
        int num=sc.nextInt();//这个方法是将输入的返回为一个int量
        System.out.println("键盘输入的int数值为"+num);
        String str=sc.next();//这是返回为字符串
        System.out.println("键盘输入的字符为"+str);
    }
}
