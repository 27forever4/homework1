package demo5;

import java.util.Scanner;

public class Account {
    int id;
    int balance;
    boolean getMoney;
    boolean saveMoney;
    int money;

    public void getInfo() {
        System.out.println("卡号："+id+"余额："+balance);

    }
    public void withdraw(){
        System.out.println("请输入你要取出的存款大小：");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if (a>balance){
            getMoney=true;
            System.out.println("余额不足，无法取出");
        }else {
            getMoney=false;
            balance=balance-a;
            System.out.println("取款成功！你的余额还有："+balance);
        }

    }
    public void save(){
        System.out.println("请输入你要存钱的大小");
        Scanner sa=new Scanner(System.in);
        int a= sa.nextInt();
        balance=a+balance;
        System.out.println("存款成功！你的余额还有"+balance);

    }
}
