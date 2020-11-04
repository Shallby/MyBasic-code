package Polymorphism;
/*
如何才能知道一个父类引用的对象，本来是什么子类呢？
运用instanceof 关键字来判断是否是一个子类
 */
public class InstanceOf {
    public static void main(String[] args) {
        Fu zi = new Zi2();//创建了一个多态 本来是子类
        if (zi instanceof Zi){
            Zi zi1=(Zi)zi;
            zi1.methodzi();
        }
        if (zi instanceof Zi2){
            Zi2 zi2=(Zi2)zi;
            zi2.methodzi2();
        }
    }
}
