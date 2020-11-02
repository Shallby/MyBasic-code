package come.atsue.java;
/*
静态代码块的格式“
    public class 类名称{
    static{
         //静态代码块的内容
    }
  }
 特点：当第一次用到本类时，静态代码块执行唯一的一次。\
 作用：既然静态属性使大家相同对象都有的属性  那么在构造对象的时候 ，直接用静态代码块一次性的给
      所有静态属性去赋值
 */
public class StaticBlock {
    public static void main(String[] args) {
        StaticKeyWords one=new StaticKeyWords();
    }
}
