package demo7;

import java.util.Scanner;

public class Ticket {
    int price;
    String name;
    int age;


    public void buyTicket(){
        System.out.println("请输入姓名");
        Scanner sc=new Scanner(System.in);
        name = sc.next();
        System.out.println("请输入你的年龄");
        int age = sc.nextInt();
        if (age>5){
            System.out.println(name+"的年龄是"+age+"，门票价格为20元");
        }else{
            System.out.println(name+"的年龄是"+age+"门票免费");
        }

    }
}
