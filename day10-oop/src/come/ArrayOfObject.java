package come;
/*
定义一个数组 用来存储三个person对象
数组有一个确定 一旦确定 程序运行期间长度不可以发生改变。三个就是三个 这用起来很不方便
比如 刚开始不知道有多少个对象 为了解决这个问题
还有Arraylist
 */
public class ArrayOfObject {
    public static void main(String[] args) {
        Person[] Array=new Person[3];
//        Person one =new Person("迪丽热巴");
//        Person two =new Person("古力拉扎");
//        Person three =new Person("马尔咋哈");
        Array[0] =new Person("迪丽热巴");
        Array[1]=new Person("古力拉扎");
        Array[2]=new Person("马尔咋哈");
        Array[0].show();
        Array[1].show();
        Array[2].show();
    }
}
