package Introduce;
/*
    objects类中有一个 静态方法
        public static<T> T requireNonNull( T obj){
        if(obj==null)
            throw new NullPointerException();
        return obj;
     }
     这是java自带的 可以用来判断是否是空指针 减少代码量
 */
public class Objects {
    public static void main(String[] args) {
            Method(null);
    }

    public static void Method(Object obj){
//        //判断输入是否合法
//        if(obj==null){
//                throw new NullPointerException("传递的值是一个空的");
//        }
        java.util.Objects.requireNonNull(obj);
    }
}
