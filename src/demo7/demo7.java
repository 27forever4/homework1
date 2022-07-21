package demo7;

import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        System.out.println("请问你是否要买票:Y/N");
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        if ("Y".equals(a)){
            ticket.buyTicket();
        }else {
            System.out.println("拜拜");
        }

    }
}
