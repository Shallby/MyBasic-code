package DemoHongBao;
import java.util.ArrayList;

/*
由于抽象类有两种构造方法 所以子类 也就是这个类至少得有一个包含参数的构造器 去调用父类/抽象类中的有参构造器
 */
public class Qunzhu extends Uer{
    //虽然是继承了了抽象类的构造器 但是子类本身也要有相应的构造器 这样子才能有this 以供后面使用
    //否则那么只能使用super.关键字来创建对象  总之 这个必须的 就是至少子类也得包括父类的构造器 简单的做法是在子类的构造器中调用
    //父类的super（参数）构造器
    public Qunzhu(String name, int balance) {
        super(name, balance);
    }

    public Qunzhu() {
    }

    public ArrayList<Integer>send(int money,int count){
        ArrayList<Integer> redlist =new ArrayList<>();
        //首先看看群主还有多少余额
        int leftmoney = this.getBalance();
        if (leftmoney> money){
            this.setBalance(leftmoney-money);
            int avg=money/count;
            int mod=money%count;
            for (int i = 0; i < count-1; i++) {
                redlist.add(avg);
            }
            int last=avg+mod;
            redlist.add(last);
            return redlist;
        }else {
            System.out.println("余额不足");
            return redlist;
        }

    }
}
