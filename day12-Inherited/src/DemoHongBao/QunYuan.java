package DemoHongBao;

import java.util.ArrayList;
import java.util.Random;

public class QunYuan extends Uer{
    public QunYuan() {
    }

    public QunYuan(String name, int balance) {
        super(name, balance);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包中随机抽取一个 给我自己
        //随机获取一个集合当中的索引
        int index =new Random().nextInt(list.size());
        //根据索引。从集合中删除，并且得到被删除的红包给我自己
        int delta = list.remove(index);
        //当前成员本身原来有多少钱；
        this.setBalance(this.getBalance()+delta);
    }
}
