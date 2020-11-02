package Demo06;
/*
如果只是继承了一半  那么依旧仍然是一个抽象类 还是需要子类来继承并将所有的抽象方法都实现完成才行
 */
public  abstract class dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗狗喜欢吃骨头");
    }
}
