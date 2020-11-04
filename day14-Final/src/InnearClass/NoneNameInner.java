package InnearClass;
/*
如果接口的实现类 或是父类的子类 只需要使用唯一一次 那么
这种情况下 就可以省略掉该类的定义 而直接该用使用  匿名内部类‘  就是指的是没有名字的内部类 直接new 接口名称（）{}
格式：
    接口名称 对象名称 =new 接口名称（）{
    //覆盖重写所有抽象方法  这样子就直接在实现接口的同时 就直接的创建了对象 这样子就可以省略了一次类的创立
    }
解析 new 接口名称（）{。。。}
1.new表示创建对象的动作
2.接口名称就是匿名内部类需要实现哪个接口
3{。。。}这才是匿名内部类的内容
4.匿名内部类，在创建对象的时候只能使用一次
  如果想要多次创建对象  那么还是去单独定义一个类 要不然{。。。}这个就只能用一次
  匿名对象是省略的对象名称 没有名字
  而匿名内部类是直接用接口来创建对象 对象没有名字 这个类就是{。。。} 而且这个类只能用一次

5.超级进化 可以在匿名内部类的同时还去进行一次匿名对象的创建 那么就是没有类名 没有对象名 直接用接口进行一系列的操作

总结：匿名内部类在【创建对象】的死后只能使用唯一一次。如果希望多次创建对象，而且类的内容一样的话，那么就必须单独定义实现类了
     匿名对象是【调用方法】的时候只能唯一一次，只能调用一次某一个方法，如果希望用一个对象同时调用多次 ，那么久必须给对象一个名字
     匿名内部类是省略了【实现类/子类】，直接用的方法，但是匿名对象是省略了【对象名称】
 */
public class NoneNameInner implements Myinterface{
    @Override
    public void method() {
        System.out.println("接口已经实现");
    }

    public static void main(String[] args) {
        NoneNameInner obj = new NoneNameInner();
        obj.method();
        //使用匿名内部类
        Myinterface obj1=new Myinterface() {
            @Override
            public void method() {
                System.out.println("使用了匿名内部类");
            }
        };//注意 这里得有一个分号  这和单独弄一个类有很大的区别
        obj1.method();

        new Myinterface() {

            @Override
            public void method() {
                System.out.println("我是超级进化 没有类名 没有对象名");
            }
        }.method();
    }
}
