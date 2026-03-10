package com.liaoying.a09stringdemo;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        while (true) {
            /*键盘录入字符串，将该字符串进行反转，当输入拜拜的时候，程序停止运行*/
            System.out.println("请输入字符串：");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();//键入
            String str2 = "";
            StringBuilder sb = new StringBuilder(str);//创建StringBuilder的对象
            if (str.equals("拜拜")) {
                break;//程序停止运行
            } else {
                sb = sb.reverse();//反转
                str2 = sb.toString();//转成字符串
            }
            System.out.println(str2);//打印
        }
    }
}
