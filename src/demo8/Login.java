package demo8;

import java.util.Scanner;

public class Login {
    String name;
    int code;
    boolean idCode=false;

    int newCode;
    public void change(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        name= sc.next();
        System.out.println("请输入你的密码");
        code= sc.nextInt();
        System.out.println("请输入新密码");
        newCode= sc.nextInt();
        do {
            System.out.println("请输入用户名：");
            String a= sc.next();
            System.out.println("请输入新密码");
            int b=sc.nextInt();
            if (a.equals(name)&&b==newCode){
                idCode=true;
                System.out.println("修改密码成功！您的新密码是："+b);
                break;
            }
        }while(!idCode);


    }
}
