package ClassAsDateType;

public class Hero {
    //成员变量可以用一个类来修饰
    private String name;
    private int age;
    private Weapon weapon;
    private Skill skill;

    public Hero() {
    }

    public Hero(String name, int age,Weapon weapon,Skill skill) {
        this.name = name;
        this.age = age;
        this.weapon=weapon;
        this.skill=skill;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(){
        System.out.println("年龄为" + getAge() + "姓名为" + getName() + "正在用" + getWeapon().getCode()+ "攻击，而且特效为");
        getWeapon().Show();//这里最好是getWeapon 为什么呢  因为标准一些 但是在这类里仍然是可以用private的weapon这一属性的
    }
}
