package come.atseu.java;

public class Person {
    private int age;
    private String Name;

    public void show(){
        System.out.println("我是"+Name+",我今年"+age+"岁了");
    }
    public void setAge(int x){
        age=x;
    }
    public void setName(String x){
        Name=x;
    }

}
