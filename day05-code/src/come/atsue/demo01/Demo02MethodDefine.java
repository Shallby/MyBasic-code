package come.atsue.demo01;
/*
方法：若干语句的集合 避免代码的重复写

参数（原料 进入的材料）
返回值（产出物 出来的产品）

修饰符 返回值类型 方法名称（参数类型 参数名称，，，，， ）{
    方法体
    return 返回值；
 }
修饰符 现在阶段就是：public static
返回值类型 就是产生的返回值是四种类型的哪一种
参数类型 进入方法的是什么类型
参数名称 进入方法的数据对应的变量名称
备注：如果参数有多个，使用逗号进行分割
return ：两个作用1.第一停止当前方法
                 第二将后面的返回值还给调用处
                 返回值是方法执行之后产生的数据结果
        返回值必须和方法前面的：”返回值类型“要保持一致
 */
public class Demo02MethodDefine {
    public static void main(String[] args) {//程序的起点是main方法
        int c;
        c=sum(8,9);//赋值调用
        System.out.println(c);
        System.out.println("你要求得的结果是"+sum(8,9));//直接调用
    }

    public static int sum(int a,int b){
        System.out.println("=_=方法开始执行啦=_=");
        return a+b;
    }
    //如果返回值类型是void 那么就只能进行单独调用 不可以用于直接调用以及赋值调用
}
