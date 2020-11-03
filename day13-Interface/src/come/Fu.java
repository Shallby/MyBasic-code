package come;

public class Fu {
     private int age;
     private String name;

    public Fu() {
    }

    public Fu(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showname(){
        System.out.println("我叫"+this.getName()+",今年"+this.getAge()+"岁了");
    }
}
