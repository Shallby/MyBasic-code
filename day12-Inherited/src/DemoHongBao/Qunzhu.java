package DemoHongBao;

import java.util.ArrayList;

/*
由于抽象类有两种构造方法 所以子类 也就是这个类至少得有一个包含参数的构造器 去调用父类/抽象类中的有参构造器
 */
public class Qunzhu extends Uer{
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
