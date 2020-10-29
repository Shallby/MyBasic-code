package come.atsue.java;
/*
利用alt+insert 调用private修饰的成员属性

this 关键字的使用 当遇到方法的输入参数与类中定义的parameter一样 就需要使用this关键来加以区别
在没有用this修饰的时候 ，是会优先使用局部变量 也就是输入参数 如果要想用成员变量就用this修饰 如this.name

this关键字可以解决重名 分不开的情况
 注意：通过谁调用，谁就是 this。也就是那个对象.方法就是那个对象
 */
public class Demo01StudenClass {
        private String name;
        private int age;
        private boolean sex;

        public boolean isSex() {
                return sex;
        }

        public void setSex(boolean sex) {
                this.sex = sex;//看 输入参数是sex 而用this修饰的sex就是对象的sex parameter
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
}
