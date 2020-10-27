package come.atsue.demo01;
/*
复习方法的入门基础知识
定义格式：
public static void 方法名（）{
        方法体

  }\
调用格式：
方法名称();
注意！！！方法要定义在class内 方法的定义不能超出去类的范围
        不能在一个方法内定义另外的方法
        方法不能自我实现，需要调用才行
 */
public class Demo01Method {
    public static void main(String[] args) {
        printmethond();
    }

    public static void printmethond(){
        for(int i=0;i<20;i++){
            for (int j=0;j<20;j++){
                System.out.print("*$*");//println是指打印这一行之后再换行 而去掉ln就不会换行了
            }
            System.out.println(" ");
        }
    }
}

