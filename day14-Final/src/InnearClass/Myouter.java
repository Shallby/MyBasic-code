package InnearClass;
/*
局部内部类如果希望访问所在方法的局部变量，那么这个局部变量必须是final修饰的不可修改常量
原因：
    跟生命周期长短有关系
    1.new 出来的对象在堆内存当中
    2.局部内部类跟着方法的运行有关系
    3.但是但是new出来的对象是生存在栈内存。
    4.但是new出来的对象是一直都持续存在的 而方法结束之后就会很快小时
 */
public class Myouter {
    public void methodOuter(){
        final int num =20;
        class  Myinner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
