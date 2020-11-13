package Generic;
/*
    含有泛型的接口，第一种使用方式：定义接口的实现类 实现类节后，指定接口的泛型
    public interface Iterator<E>{

    }

 */
public class GenericImplements implements GenericInterface {


    @Override
    public <E> void method(E e) {
        System.out.println(e);
        System.out.println("类似于静态方法和普通方法 这里是创建了一个类使得能够实现泛型的abstrat方法");
    }
}
