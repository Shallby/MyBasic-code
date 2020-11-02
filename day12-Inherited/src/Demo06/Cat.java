package Demo06;

public class Cat extends Animal {
    public Cat(){
        System.out.println("子类的构造器开始启动");
    }

    @Override
    public void eat() {
        System.out.println("小猫爱吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("小猫猫是可以趴着睡觉的");//实现抽象类中的抽象方法可以直接alt+enter选择第一个implement实现
    }
}
