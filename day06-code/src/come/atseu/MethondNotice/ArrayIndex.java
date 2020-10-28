package come.atseu.MethondNotice;
/*
数组索引是从0开始的
1.所谓的数组索引越界 就是索引号超过了arrayIndexOutOfBoundsException
2.每New一个数组都会在堆空间中打开一个 之后新new的数组如果是相同的名字 那么老数组都会被jvm的垃圾回收机制回收了
 */
public class ArrayIndex {
    public static void main(String[] args) {
        int[]  Array ={15,23,242,35};
        System.out.println(Array);
//        for(int i=0;i<4;i++){
//            System.out.println(Array[i]);
//        }//利用循环输出数组的每一个元素
        for(int i=0;i<Array.length;i++){//这一句话都是可以用Array.fori
            System.out.println(Array[i]);
        }//利用循环输出数组的每一个元素比上面更好在不需要担心索引越界 根据数组的length方法总是会输出每一个元素
//        for (int i = 0; i < Array.length; i++) {//这一句话都是可以用Array.fori
//            {
//
//            }
//        }
    }
}
