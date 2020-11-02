package Demo02Extends;

public class Zi extends Fu{
    int num=10;

    @Override
    public void show() {
        System.out.println("我子类虽然继承了父类的成员方法，但是我自己override了，这和overload有不同");
    }
}
