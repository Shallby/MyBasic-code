package Polymorphism;

public class Zi extends Fu {
    int age=10;
    @Override
    public void method() {
        System.out.println("这是子类重写的");
    }
    public void methodzi(){
        System.out.println("这是子类特有的方法");
    }
}
