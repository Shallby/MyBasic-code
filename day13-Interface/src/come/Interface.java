package come;
/*
接口是一种公共的规范标准 只要符合标准 大家都可以通用 USB 电源接口等等都是公告规范  电脑都是自带的USB都是母口 外部设备都是公口
在代码中 接口是一种引用数据类型  是多个类的公共规范，最重要的就是其中的abstract方法 抽象方法
定义一个接口格式
 public interface 接口名称（）{
    //接口内容
 }
可以看到接口是一种方法 只是很特殊 是方法也是在方法名之后有一个（）括号的
备注：换了关键之后编译生成的文件也是：.java>。class

在JDK9之后接口可以包括
1.常量     其实就是一个常量 不过是一个不可以改变的 实际上使用的public static finall等三个关键字修饰的
          有final修饰的默认值一定要首先手动修改 类使用局部变量 定义之后就需要很快就赋值 要不然一直都是默认值
2.抽象方法  自动继承
3.默认方法  自动继承
4.静态方法  不会自动继承 在实现类中不能调用接口中的静态方法
           正确方法是：通过接口名称。静态方法名 静态方法还是一样 静态跟对象无关 只跟类有关系 所以没必要去弄一个对象去调用
5.私有方法  这是给专给默认方法使用的 怎么说呢 就是将公共方法抽离出来 然后在接口类中供默认方法 这是在java9开始有的
           private有普通私有方法 private 返回值类型 方法名称（参数列表）{}
                    静态私有方法private static 返回值类型 方法名称（参数列表）{}

接口的使用步骤
1.接口不能直接使用 必须有一个实现类来实现该接口的所有功能
格式
public class 实现类名称 implements 接口名称{
}
2.实现接口类中的所有抽象方法
  也就是override
3.创建实例对象 进行使用
4.注意对于实现接口中的抽象方法 如果仍然有抽象方法没有被实现 那么就只能定义为一个抽象类
*/
public class Interface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl myInterfaceAbstract=new MyInterfaceAbstractImpl();
        myInterfaceAbstract.methodAbs();
        myInterfaceAbstract.methodDefaut();
        String s="com.jd.".replaceAll(".","/")+"MYclass.class";//真的是太细了
        System.out.println(s);

        MyInterfaceAbstract.show();//直接利用静态方法直接调用 静态属性也是可以用类直接调用的


        myInterfaceAbstract.callDefault();
        myInterfaceAbstract.callDefault2();
        MyInterfaceAbstract.callDefault3();//静态方法只能调用静态方法 不能调用成员方法 也就是不能掉用private 等和对象有关系的方法 因为一旦是static修饰的 那就与对象没有任何关系了
        System.out.println(MyInterfaceAbstract.Num_Of_Interface);
    }
}
