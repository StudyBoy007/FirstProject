package com.ecjtu.Exception.WithDraw;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/6/5  15:36
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎来到传习银行，请输入你的账户账号与密码~");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("用户名：");
            String username = input.next();
            System.out.print("密码：");
            String password = input.next();
            boolean b = new Test().juifyIdentification(username, password);
            if (b) {
                withdraw();
                break;
            } else {
                System.out.println("登录失败,是否重新输入：\n1.Yes\n2.No");
                int i = input.nextInt();
                if (i == 1) {
                    continue;
                } else if (i == 2) {
                    System.out.println("欢迎再次来到传习银行,下次光临！");
                    System.exit(0);
                }
            }
        }
    }

    public boolean juifyIdentification(String username, String password) {
        if ("s".equals(username) && "123456".equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public static void withdraw(){
        boolean juify=true;
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请输入你想要取得金额数目：");
                int money=input.nextInt();
                System.out.println("你已经成功取出了"+money+"元");
            } catch (InputMismatchException e) {
                System.out.println("输入的金额必须为整形！！");
                String s=input.next();//把输错的字符先重缓冲中输出来
                juify=false;
            }finally {
                if (!juify) {
                    System.out.println("输入失败,是否重新输入：\n1.Yes\n2.No");
                    int i=input.nextInt();
                    if(i==2){
                        System.exit(0);
                    }
                    juify=true;
                }else {
                    System.out.println("是否还需要继续取钱：\n1.Yes\n2.No");
                    int i=input.nextInt();
                    if(i==2){
                        System.out.println("欢迎下次光临！");
                        System.exit(0);
                    }
//                    continue;
                }
            }
        }
    }

}
