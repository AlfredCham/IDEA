package cn.itcast.GiftMoney;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("开始发红包了！！");
        Manager manager = new Manager("manager",100);
        Member one = new Member("jack",0);
        Member two = new Member("lily",0);
        Member three = new Member("vity",0);

        manager.show();
        one.show();
        two.show();
        three.show();

        System.out.println("=====================");

        ArrayList<Integer> list = manager.giftMoney(20,3);
        one.receiveMoney(list);
        two.receiveMoney(list);
        three.receiveMoney(list);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
