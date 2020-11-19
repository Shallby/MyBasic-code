package CommunicationOfThread;
/*
资源类：包子类
        设置包子的属性
                皮
                馅
          包子的状态：有 true 无 false
生产者类：线程类  可以继承Thread
        设置线程任务（run）：生产包子
        对包子的状态进行判断
        true：有包子 包子铺调用wait方法 进入waiting状态
        false：没有包子 包子铺生产包子 增加一些趣味性：交替生产两种包子
                            1.i%2==0
                      包子铺生产好了包子要修改包子 资源类的状态  唤醒吃货线程
消费者类：线程类  可以继承Thread
        false：没有包子 吃货等着 调用wait方法 进入waiting状态
        true：有包子 吃包子 吃完了并修改包子的状态 吃货唤醒包子线程  生产包子
测试类：
        包含main方法 程序的入口，启动程序 创建包子对象 包子铺对象 吃货对象 等线程 并开启
*/
public class NeededClass {
}
