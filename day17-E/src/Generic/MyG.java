package Generic;
//创建含有泛型的类就是在类名之后加上一个<E>就行 其中这个字母E没有关系 任意字母都可
/*
    public class 类名<E> {

    }

2.定义含有泛型的方法
    格式：
        修饰符<泛型> 返回值类型 方法名(参数列表（使用泛型）){
            方法体
        }
 */
public class MyG<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

//定义一个含有泛型的方法
    public<M> void  MyFuncGeneric(M m){
        System.out.println(m);
    }

    public static <E> void StaticMethodGeneric(E e){
        System.out.println("使用了静态方法");
        System.out.println(e);

    }
}
