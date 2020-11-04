package InnearClass;
/*
Body$Heart
 */
public class Body {
    //成员内部类
    public class Heart{
        public void beat(){
            System.out.println("心脏跳动，蹦蹦蹦");
            System.out.println("我叫"+getName());
        }
    }

    //外部类的成员变量
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //外部内的方法
    public void methodbody(){
        System.out.println("外部类方法");
        System.out.println("即将通过外部类的成员方法创建匿名对象调用内部类方法");
        new Heart().beat();
    }
}

