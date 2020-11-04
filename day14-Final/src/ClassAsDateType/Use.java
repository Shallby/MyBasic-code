package ClassAsDateType;
/*
总结 ：
    1.这也太套娃了
    2.一个类可以修饰一个类的成员变量 这就可以超级定义属性了
    3.实际上 这是指的是先创建一个武器类
        这个类拥有对应的成员变量和成员方法
        而这个类 整体上 他是另外一个类的成员变量
        所以 在最终用的时候
        实现创建武器对象 然后作为参数 进入到另外一个英雄对象的构造方法中来

        总的来说 最后把接口作为修饰类的成员属性应该意义不是很大
 */
public class Use {

    public static void main(String[] args) {
        Weapon 多兰剑 = new Weapon("多兰剑", 99908);
        Hero hero = new Hero("德玛西亚",20,多兰剑, new Skill() {
            @Override
            public void eat() {
                System.out.println("盖伦大侠打累了 想要休息一下");
            }
        });//注意这里还用到了匿名内部类
        hero.attack();//注意不要放入一个匿名对象
        System.out.println(hero.getWeapon().getCode());//输出一下盖伦拿的是什么武器  首先是hero对象下面的getweap是返回了一个weapon武器 然后再调用武器下面的武器成员属性
        hero.getSkill().eat();
    }

}
