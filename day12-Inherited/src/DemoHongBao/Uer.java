package DemoHongBao;

public abstract class Uer {
    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Uer(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public Uer() {
    }

    public void show(){
        System.out.println("我是"+getName()+",我有"+getBalance()+"这么多钱");
    }
}
