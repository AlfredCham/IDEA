package cn.itcast.GiftMoney;


import java.util.ArrayList;
import java.util.Random;

public class Member extends Uers {
    public Member() {
    }

    public Member(String name, int balance) {
        super(name, balance);
    }
    public void receiveMoney(ArrayList<Integer>  list){
        Random random = new Random();
        int num = random.nextInt(list.size());
        int rednum = list.remove(num);
        setBalance(getBalance()+rednum);
        System.out.println(getName()+"  抢到了"+getBalance()+"元");
    }
}
