package Introduce;
/*
java四种权限修饰符
            public  >  protected  >  (default)  >  private
同一个类      　是　　　　　　　　是　　　　　　　是　　　　　　　是
同一个包       是             是　　       是            否
不同包子类     是              是           否     　     否
不同包非子类    是             否            否      　   否
在用一个路径下的不同包　仍然是需要导包的

注意定义一个类的时候，权限修饰符规则:
    1.外部类：public/（default  也就是不写）
    2.成员内部类可以有 public protected default private
    3.局部内部类，什么都不能写
 */
public class PowerKeys {
}
