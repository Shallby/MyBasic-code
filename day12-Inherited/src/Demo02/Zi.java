package Demo02;

public class Zi extends Fu {
    int num=10;
    public void show(){
        int num=1;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类
        System.out.println(super.num);//父类
    }

    @Override//注解 用来检测是否进行了有效的重写 这个是可选的  删除了也没有关系  只要是保证子父方法名一致而且参数列表页相同的 那么就成立了覆盖重写
    public void MthodFu() {
        System.out.println("子自有的方法 与父同名");
    }

    @Override
    public void call() {
        super.call();//把父类的方法拿来使用 并且在之后再添新功能
        System.out.println("显示头像");
        System.out.println("显示姓名");
    }
}
