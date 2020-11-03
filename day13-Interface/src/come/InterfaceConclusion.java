package come;
/*
1.成员变量其实是一个常量 而且使用public static final 常量名=数值；哪怕是你自己不写这前三个修饰符 那么也是由jvm添加进去
2.接口中最重要的是抽象方法
    public abstract 返回值类型 方法名称（参数列表）{}
3.java8之后允许有默认方法 自动继承 和普通的成员方法区别是用的default修饰
4.java8开始允许有静态方法 也是只能是用过类。进行调用
5.java9开始 可以有了private方法
private方法只能供接口中的默认方法 以及静态方法用
 */
public class InterfaceConclusion extends Fu implements MyInterfaceAbstract ,MyIterface2{
    @Override
    public void methodAbs() {
        System.out.println("我实现了第一个接口，并重写了对应接口中的抽象方法，同时我还继承了三个默认方法");
    }

    @Override
    public void method2() {
        System.out.println("我实现了第二个接口，并重写了对应的抽象方法");
    }

    public InterfaceConclusion() {
    }

    public InterfaceConclusion(int age, String name) {
        super(age, name);
    }
}
