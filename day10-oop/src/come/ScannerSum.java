package come;
import java.util.Scanner;
public class ScannerSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MATH math=new MATH();//调用了自己创建个一个MATH类 这个类有实现求和功能
        System.out.println("您好，很高兴为您服务，请问您需要计算多少位数据呢？");
        int x=scanner.nextInt();//虽然不能直接进入  但是我可以用一个成员变量先来保存好
        System.out.println("好的 你想计算"+x+"位数据，这就马上为您计算 请您开始输入数据吧");
        int[] ScIn= new int[x];//这是创建一个动态数组 我也不知道会有多少位  经过程序的运行 发现直接弄一个这样子的 数组不行 需要提设置一下
        for (int i = 0; i < ScIn.length; i++) {
            if (i == (ScIn.length - 1)) {
                ScIn[i] = scanner.nextInt();
                System.out.println("您输入了最后一个数据：" + (i + 1) + "，即将开始计算");
            } else {
                ScIn[i] = scanner.nextInt();
                System.out.println("输入了第：" + (i + 1) + "个数了");
            }
        }
        System.out.println("根据您输入的数据，我们求得之和为："+math.Sum(ScIn));
        System.out.println("其中最大数值为："+math.Max(ScIn));//太美了 想要实现什么就去创建具有某种功能类的对象 通过对象去调用那个方法

    }

}
