package cn.itcast.day09;

import java.util.Scanner;

public class StringPractise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        int A = 0;
        int a = 0;
        int num=0;
        int other =0;
        for (int i = 0; i < ch.length; i++) {
            if ('A'<= ch[i] && ch[i]<='Z'){
                A++;
            }
            else if ('a'<=ch[i] && ch[i]<='z'){
                a++;
            }
            else if ('0'<=ch[i] && ch[i]<='9'){
                num++;
            }else
                other++;
            }
        System.out.println("大写字母有"+ A +"个");
        System.out.println("小写字母有"+ a +"个");
        System.out.println("数字有"+ num +"个");
        System.out.println("其他有"+ other +"个");
        }
    }
