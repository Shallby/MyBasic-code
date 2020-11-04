package ClassAsDateType;

public class Weapon {
    private String code;
    private int power;
    //实际上这个写方法暂时还不需要  错误 这是需要 因为当武器成为另外一个类的成员变量的话 那么后面会用到这个成员变量的所有成员变量以及成员方法
    //真的是很套娃啊！！！！
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Weapon(String code, int power) {
        this.code = code;
        this.power = power;
    }

    public void Show(){
        System.out.println("这是一把举世无双的武器，一刀999999999999");
    }
}
