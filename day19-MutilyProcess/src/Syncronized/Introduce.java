package Syncronized;
/*
 出现了卖重复票以及不存在的票  使用同步代码块解决这个安全问题
格式：
    synchronized（锁对象）{
        可能出现线程安全问题的共享数据代码
   }
   注意：
        1.代码块中的锁对象可以是任何对象
        2.但是必须要保证各个使用共享数据的线程的锁对象是一致的
        3.锁对象的作用
            把同步代码块锁住，只让一个线程在同步代码块中执行
1.同步技术实现的原理
    使用了一个锁对象 这个对象就叫对象锁  也叫对象监视器
    三个线程谁先抢到了cpu的执行权 遇到synchronized同步代码块
    这时就会检查synchronized代码块是否有锁对象
    那么就会获取锁对象 并进去同步代码块之中去执行
这像什么呢 同步锁对象其实就像是一个钥匙  不论是t0 t1 t2 她们谁遇到了同步代码快 只有带着锁对象才能进入这个代码块
    上一个线程当完成了代码块里面的所有代码之后 就会将锁对象又释放 这样下一次又来抢  看谁再抢到锁对象

总结： 同步中的线程，没有执行完毕就不会释放锁 同步外的线程没有锁对象就进不去 没有门票就是
      正是因为有同步锁对象 这样就保证了线程在同步执行中保证了共享数据的安全
2.同步方法 修饰符 synchronized 返回值类型 方法名（参数列表）{
        可能出现线程安全问题的代码 （共享数据）
    }

3.静态同步方法 就是在之前的基础上加上static修饰
        静态方法的锁对象不能是this  一位内静态方法是优先于对象进入内存
        所以静态方法的锁对象是class属性--》class文件对象（反射）

 */
public class Introduce {
}
