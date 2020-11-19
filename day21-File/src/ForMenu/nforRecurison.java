package ForMenu;
/*
利用递归计算N！
基本思路和求和是一模一样的
使用递归重要的是知道什么时候用递归
 */
public class nforRecurison {
    public static void main(String[] args) {
        int Result = Show(3);
        System.out.println(Result);
    }

    private static int Show(int i) {
        if (i==1){
            return 1 ;
        }
        return  i*Show(i-1);
    }
}
