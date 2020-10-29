package come.atseu.java;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
局部变量与成员变量
1.定义的位置不一样 重点
    局部变量定义在方法的内部
    成员变量定义在类中 在方法的外部 类似于全局变量的概念 但是如果类中的成员变量没有修饰为静态变量 也是不能直接在方法中直接调用的
2.作用的范围不一样
    局部变量只能在方法中使用，除了就不能使用
    成员变量在整个类中都可以使用
3.默认值不一样
    局部变量没有默认值，如果想要用必须手动赋值
    成员变量没有赋值会自动赋默认值 规则和数组一样
4.内存地址不一样
    局部变量位于栈内存 应用于方法的
    成员变量位于heap堆中 是从方法区拷贝而来
5.生命周期不一样
    局部变量随着方法进栈而诞生，随着方法出栈而结束
    成员变量随着对象创建而诞生 随着对象被jvm垃圾回收机制回收而终止。
 */
public class Demo06VariableDifference {
    private static String Name="梨园寻";
    public static void main(String[] args) {
        System.out.println("成员变量在main中调用"+Name);
//        System.out.println("局部变量在main中调用"+age);局部变量不能在出了方法之外的地方调用
        method();
    }
    public static void method(){
        int age=18;
//        System.out.println(age);//没有赋值 不能直接使用
        System.out.println("局部变量在方法中调用  "+age);
        System.out.println("成员变量在方法中调用  "+Name);
    }
}
