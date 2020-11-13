package FinallyCodeStock;

import java.util.List;

/*
    多个异常对象使用捕获又该如何处理呢？
     1.多个异常分别处理
     2.多个异常一次捕获 多次处理
     3.多个异常一次捕获一次处理
     finally中如果有return语句 那么就要注意这种情况的出现  因为finally中的代码一定都是会执行的代码
 */
public class SeveralException {
    public static void main(String[] args) {
        //1多个异常 分别处理
        try{
            int[] array={1,2,3};
            System.out.println(array[3]);//ArrayIndexOutOfBoundsException:3
        }catch (ArrayIndexOutOfBoundsException E){
            System.out.println(E.getMessage());
            System.out.println("数组索引错误");
        }
        try{
            List<Integer> list=List.of(1,2,3);
            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }catch(IndexOutOfBoundsException e){//集合越界产生的异常
            System.out.println(e.getMessage());
            System.out.println("集合索引错误");
        }
        System.out.println("多个异常 分别处理 后续代码");
        //多个异常一次捕获多次处理
        /*
        也就是一个try 多个catch
        catch里面定义的异常变量 如果有子父类关系
        那么子类的异常对象要在上面 父类的下载下面 否则就会出现错误
         */
        try{
            int[] array={1,2,3};
            List<Integer> list=List.of(1,2,3);
            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            System.out.println(array[3]);//IndexOutOfBoundsException:3
        }catch (ArrayIndexOutOfBoundsException E){
            System.out.println("多个异常一次捕获  这是第一个异常处理 ArrayIndexOut");
        }catch(IndexOutOfBoundsException e){//此变量没有被使用 是一句废话
            System.out.println("多个异常一次捕获  这是第二个异常处理");
        }
        System.out.println("后续代码!");
        //多个异常对象 一次处理
        try{
            int[] array={1,2,3};
            List<Integer> list=List.of(1,2,3);
            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            System.out.println(array[3]);//IndexOutOfBoundsException:3
        }catch(Exception e){//此变量没有被使用 是一句废话
            System.out.println("多个异常一次捕获  这是一次全部异常处理");
            System.out.println(e);
        }
        System.out.println("后续代码");
    }
}
