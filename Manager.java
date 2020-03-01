package cn.itcast.GiftMoney;

import java.util.ArrayList;

public class Manager extends Uers {
    public Manager() {
    }

    public Manager(String name, int balance) {
        super(name, balance);
    }

    public ArrayList<Integer> giftMoney(int total, int count) {
        ArrayList<Integer> list = new ArrayList<>();
        int managerBalance = super.getBalance();
        super.setBalance(managerBalance-total);
        //向集合中加元素，及每个红包的金额，可能不能整除，余数给最后一个
        if (total > getBalance()) {
            System.out.println("余额不足");
            return list;
        } else {
            int avg = total / count;
            int rem = total % count;
            for (int i = 0; i < count; i++) {
                if (i == count - 1) {
                    list.add(avg + rem);
                } else
                    list.add(avg);
            }
        }return list;
    }

}
