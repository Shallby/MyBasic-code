package ForMenu;
/*
递归的次数不能太多 要不然到达一定的次数肯定会发生栈内存溢出
  1递归分为两类 直接递归 间接递归
    直接递归称为方法自己调用自己
    简洁递归表示A调用B的方法  B调用C的方法 C调用A的方法
  2递归都是有一定的次数限制的
  3构造方法不能递归
  4递归的使用必须明确
    1.递归的结束条件
        获取到1的结束条件
    2，递归的目的
  5仅仅是计算多个常数的和不建议使用递归 因为递归比较消耗内存资源 效率还很低
 */
public class StackFolw {
    public static void main(String[] args) {
//        a(1);
//    }
//
//    private static void a(int i) {
//        System.out.println(i);
//        if(i==20000){
//            return;//结束递归
//        }
//        i++;
//        a(i);
   //使用递归计算1+n；
        int Total = sum(3);
        System.out.println(Total);

    }

    private static int sum(int i) {
        if (i==1){
            return 1;//结束递归
        }
        //获取下一个被加数
        System.out.println("开始了递归哦!");
        return i+sum(i-1);
    }
}
