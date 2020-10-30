package come;

import java.util.Random;

/*
Random类的使用 这个随机数是我们无法控制的
idea的强大之处在于他可以将我们使用的类自动从javajdk中导入
参数代表了范围 左闭右开区间

获取一个[1,n]并且1是可以取得到n
为了满足这个条件 很简单 整体在打印输出的时候加1就可以取得到0到n的数据了
 */
public class RandomUse {
    public static void main(String[] args) {
        System.out.println("调用Random产生的一个随机整数为"+new Random().nextInt());
        System.out.println("调用Random产生的一个随机浮点数为"+new Random().nextDouble());
        Random r1=new Random();
        for (int i = 0; i <3 ; i++) {
            int num =r1.nextInt(10);//取不到10
            System.out.println(num);
        }
    }
}
