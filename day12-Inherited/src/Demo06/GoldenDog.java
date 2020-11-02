package Demo06;

public class GoldenDog extends dog {
    @Override
    public void sleep() {
        System.out.println("金毛睡觉很乖，只不过喜欢打打呼噜而已");
    }

    public static void main(String[] args) {
        GoldenDog goldenDog=new GoldenDog();
        goldenDog.sleep();
        goldenDog.eat();
    }
}
