package come.atseu.java;

public class Demo04UsePhoneClass {
    public static void main(String[] args) {
        Demo04PhoneClass phone=new Demo04PhoneClass();
        phone.brand="小米";
        phone.price=10000;
        System.out.println(phone.brand);
        System.out.println(phone.price);
        phone.call();
    }
}
