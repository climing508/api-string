package com.liaoying.a03stringdemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*boolean equals方法（要比较的字符串）     完全一样：true     否则：false
          boolean equalsIgnore(要比较的字符串)       忽略大小写
          练习：
          已知正确用户名和密码，请用程序实现模拟用户登录，总共三次机会，登录后，给出相应提示
        */
        /*String username="张三";
        String rightusername="张仨";
        boolean s1=username.equals(rightusername);
        System.out.println(s1);

        String a="zhangsan";
        String b="ZhangSan";
        boolean s2=a.equalsIgnoreCase(b);
        System.out.println(s2);*/

        String rightusername="zhangsan";
        String rightpassword="123456";
        Scanner sc=new Scanner(System.in);
        int i=3;
            for(;i>0;){
                System.out.print("请输入用户名:");
                String username=sc.next();
                System.out.print("请输入密码：");
                String password=sc.next();
                boolean b1=username.equals(rightusername);
                boolean b2=password.equals(rightpassword);
                if (b1&&b2){
                    System.out.println("登陆成功！");
                    break;
                }else{
                    System.out.println("用户名或密码错误");
                    i--;
                }
                if (i==0){
                    System.out.println("登录失败，账户"+rightusername+"被锁定");
                }else {
                    System.out.println("登录失败，还剩下"+i+"次机会");
                }
            }
    }
}
