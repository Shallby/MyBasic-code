package come;
/*
什么是匿名对象？
一般的创建对象的格式 类名 对象名 =new 类名（）
匿名对象：
    只有右边的的对象 没有赋值运算 这种对象是一次性的 马上用完就被jvm回收 下次再new的时候又是一个新的

好处：
    很快就会被jvm回收 ，用起来也很方便 就是下次还想去用 不好意思 没有了 你错过了她 再也遇不到了 哪怕是再马上赋值也会很快被回收了 仅此一次。
 */
public class NoneNameClass {
    public static void main(String[] args) {
        Person one=new Person("泰勒.斯威夫特");
        one.show();
        new Person("高圆圆");//没法使用 要想使用就得马上在后面再.成员方法
        new Person("赵丽颖").show();
    }
}
