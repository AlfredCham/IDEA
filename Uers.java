package cn.itcast.GiftMoney;

public class Uers {
    private String name;
    private int balance;

    public Uers() {
    }

    public Uers(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    public void show(){
        System.out.println("我是"+getName()+"  我的余额为"+getBalance());
    }

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
}
