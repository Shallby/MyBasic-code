package come.atseu.MemoryAnayse;
/*
什么是先进后出
new出来的对象在堆里面
 但是行为方法在堆中保存的是一个地址 指向着方法区中保存的对应方法
 而行为变量是复制的方法区中保存的类的一样的变量
 方法区中的方法会进栈

 从main方法开始进栈 创建对象 堆中出现对应的成员变量以及成员方法
 成员方法并没有全部保存过来 只是拿了一个地址 指向着方法区对应的方法
 当对象.属性/方法时 则会修改对应的属性以及方法

 多个相同的对象 他们的方法都是保存的同一个地址 都是指向着同一个类中所写的方法区
 对象之间的赋值 是指的是将地址传过去了
 Phone p1=New Phone();
 Phone p2=p1;  这是将两个对象揉在了一起 都是指向的同一个对象 而不是各有一套 分别管理

 自定义的类可以作为参数 输入到一个自己定义的method
 同样也可以作为一个返回结果 作为输出
 */
public class ObjectMemoryAnayse {
        String Brand;
        int Price;
        String Color;

        public void Call(){
            System.out.println(Brand+"手机可以打电话");
        }
        public void Play(){
            System.out.println("玩手机");
        }
}


