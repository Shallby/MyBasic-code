package come.atseu.MethondNotice;
/*
浮点类型的数组默认值为0.0
字符串类型数组为‘\u0000’
应用数据类型那么默认为null


注意  静态初始化也是有默认值的  只不过是在数组建立之后马上就被赋了所提前规定好的内容
     过程是不会少的
 */
public class DemoArrayUse {
    public static void main(String[] args) {
        int[] array=new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        array[1]=123;//改变元素的内容  数组中某一个元素好比一个个单独的内容 也与一个变量一样 都是可以改变的
        System.out.println(array[1]);
        System.out.println(array[2]);//使用动态初始化数组时，会给每一个元素赋值 并且只要是整数类型 int byte short long都为0

    }
}
