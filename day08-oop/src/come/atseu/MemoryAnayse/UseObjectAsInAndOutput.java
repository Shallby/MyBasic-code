package come.atseu.MemoryAnayse;

public class UseObjectAsInAndOutput {
    public static void main(String[] args) {
        ObjectMemoryAnayse PHONE=new ObjectMemoryAnayse();
        PHONE.Brand="小米";
        PHONE.Color="黑色";
        PHONE.Price=2999;
        ObjectMemoryAnayse Result=Method(PHONE);//这里调用了一个以对象作为输入 并且以对象作为输出的方法
        System.out.println(Result.Brand);
        System.out.println(Result.Price);
        System.out.println(Result.Color);
    }

    public static ObjectMemoryAnayse Method(ObjectMemoryAnayse phone){
        System.out.println(phone.Brand);
        System.out.println(phone.Price);
        System.out.println(phone.Color);//由于在主函数里面有赋值  这里就不是输出默认值
        phone.Call();
        phone.Play();
        phone.Brand="苹果";
        phone.Color="红色";
        phone.Price=8999;
        return phone;
    }

}
