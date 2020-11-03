package come;
/*
alt+enter快捷键能够很快将所需重写覆盖的东西都包进来
 */
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    @Override
    public void methodAbs() {
        System.out.println("实现了接口的abstract方法达到了标准");
    }
}
