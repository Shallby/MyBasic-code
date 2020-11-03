package come;
/*
在任何版本的jdk都能定义抽象方法
public abstract 返回值类型 方法名称（参数列表）;
注意 在接口方法中的抽象方法 必须是以
1.public以及abstract修饰的抽象方法 不能是别的
2.这两个关键字最好是我们自己写，其实不写的话 jvm在后面编译的时候也是会自动给我们加上去的

备注：接口中的默认方法，可以解决接口升级的问题。什么意思呢 就是接口发布之后 已经有很多的实现类并且也都创建了相应的很多对象
     所以再添加的方法一定不能是抽象方法必须是一种默认的方法才行 否则将会导致其实现类由于存在抽象方法 那么就出问题了
     默认方法是有default修饰的 同时默认方法是自动会被继承的
     但是用了static修饰的成员方法 那么就不能被继承
 */
public interface MyInterfaceAbstract {
    public abstract void methodAbs();

    public static final int Num_Of_Interface=10;

    public default void methodDefaut(){
        System.out.println("这是新添加的默认方法");
    }

    public default void callDefault(){
        System.out.println("第一个打电话默认方法");
        call();
    }
    public default void callDefault2(){
        System.out.println("第二个打电话默认方法");
        call();
    }

    public static void callDefault3(){
        System.out.println("第三个打电话静态方法");
        call1();
    }

    public static void show(){
        System.out.println("这是一个静态方法 在java8之后都可以在接口中添加这个方法了");
    }

    private void call(){
        System.out.println("给小明打电话");
        System.out.println("给小红打电话");
        System.out.println("给小天打电话");
    }

    public static void call1(){
        System.out.println("给小明打电话");
        System.out.println("给小红打电话");
        System.out.println("给小天打电话");
    }

}
