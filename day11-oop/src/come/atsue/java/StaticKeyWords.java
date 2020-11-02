package come.atsue.java;
/*
static修饰的关键字有一个很重要的性质 它修饰的成员变量是共享的 它修饰的方法是可以直接class.Method（）直接调用
 */
public class StaticKeyWords {
    private String name;
    private int age;
    static  String room;//多个对象都是相同的属性 是一养的

    static {
        System.out.println("静态代码块调用了噢");
    }

    public StaticKeyWords(){

    }
    public StaticKeyWords(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void Show(){
        System.out.println("这是直接的调用");
    }
}
