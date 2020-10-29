package come.atsue.java;

public class StudentUse {
    public static void main(String[] args) {
        Student stu=new Student();//无参构造器创建的对象
        System.out.println("我叫"+stu.getName()+",很高兴遇到你们，我今年"+stu.getAge()+"岁了");
        Student stu2=new Student(19,"TaylorSwift三号 我是来自己于从重载之后的构造方法");
//                                  有参构造器创建的对象 在创建对象可以调用方法 这个时候就可以不断地创造新
//                                  的对象，而无参构造器却都是创建的一样的对象
//                                  不要忘了 我们的setget方法任然是有用的 因为一个对象的属性是会变的
        System.out.println("我叫"+stu2.getName()+",很高兴遇到你们，我今年"+stu2.getAge()+"岁了");
    }
}
