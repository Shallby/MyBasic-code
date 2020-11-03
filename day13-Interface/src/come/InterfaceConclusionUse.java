package come;
/*
如果父类和接口中的默认方法重复了 那么会以父类中的为主
 */
public class InterfaceConclusionUse {
    public static void main(String[] args) {
        InterfaceConclusion 欧阳锋 = new InterfaceConclusion(13, "欧阳锋");
        欧阳锋.method2();
        欧阳锋.methodAbs();
        欧阳锋.showname();//父类有了对应的get set方法 子类会自动的继承  如果子类又新添加了对应的私有成员变量 那么也子类也需要对应的get set方法

    }
}
