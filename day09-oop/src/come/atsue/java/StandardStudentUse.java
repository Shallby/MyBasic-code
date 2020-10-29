package come.atsue.java;

public class StandardStudentUse {
    public static void main(String[] args) {
        StandardStudent stu=new StandardStudent();
        stu.setAge(18);
        stu.setName("Taylor.Swift");
        System.out.println("我是一号学生我叫"+stu.getName()+"，我今年已经"+stu.getAge()+"岁了");
        StandardStudent stu2=new StandardStudent(19,"Taylor.Swift源自有参构造器");
        System.out.println("我是二号学生我叫"+stu2.getName()+"，我今年已经"+stu2.getAge()+"岁了");
    }
}
