package come;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {

        System.out.println("请先设置本游戏猜测的数据边界以便确定游戏的目标数");
        int TheRandomNum=new Random().nextInt(new Scanner(System.in).nextInt())+1;//先在[0,100]之间随便确了一个数字 作为我们需要猜的数据
        int Time=1,TotalTime;
        System.out.println("请先设置本游戏总共猜测次数");
        TotalTime=new Scanner(System.in).nextInt();
        System.out.println("开始游戏！请您输入第1次尝试的数据");
        int Guess=new Scanner(System.in).nextInt();//用Scnaner类中的nextint方法从键盘输入我们猜的

        while(Guess!=TheRandomNum){
            if (Guess>TheRandomNum) System.out.println("您猜大了，需要小一点，请您输入第"+(Time+1)+"尝试的数据");
            if (Guess<TheRandomNum) System.out.println("您猜小了，需要大一点，请您输入第"+(Time+1)+"尝试的数据");
            System.out.println("请加油哦，您还有" + (TotalTime - Time) + "次机会哦");
            Guess=new Scanner(System.in).nextInt();
            Time+=1;
            if (Time>=TotalTime){
                break;
            }
        }
        if (Guess==TheRandomNum){
            System.out.println("游戏结束！您太厉害了，您在第"+Time+"次就猜到了正确的结果");
            System.out.println("正确的结果就是"+TheRandomNum);
        }else {
            System.out.println("不好意思，请您再接再厉，正确的结果是"+TheRandomNum);
        }
    }
}
