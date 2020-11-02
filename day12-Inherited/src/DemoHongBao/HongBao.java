package DemoHongBao;

import java.util.ArrayList;

public class HongBao {
    public static void main(String[] args) {
       Qunzhu manager=new Qunzhu("群主",100);
       QunYuan memebr1 =new QunYuan("成员1",0);
       QunYuan memebr2 =new QunYuan("成员2",0);
       QunYuan memebr3 =new QunYuan("成员3",0);

       manager.show();
       memebr1.show();
       memebr2.show();
       memebr3.show();
       System.out.println("==============");
       //群主发出了一个红包集合
       ArrayList<Integer>redlist =manager.send(20,3);//群主一共发20 分三分
       memebr1.receive(redlist);
       memebr2.receive(redlist);
       memebr3.receive(redlist);
       System.out.println("==============");
       manager.show();
       memebr1.show();
       memebr2.show();
       memebr3.show();
    }
}
