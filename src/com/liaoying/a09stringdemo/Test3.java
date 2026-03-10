package com.liaoying.a09stringdemo;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*键入字符串，按长度为8拆分每个输入的字符串并进行输出
          长度不是8的整数倍请在后面补数字0，空字符不处理。*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入任意字符串：");
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);
        String str2="";
        while (sb.length()%8!=0) {
            sb = sb.append("0");
        }
        str=sb.toString();
        for (; str.length()!=0;) {
            str2=str.substring(0,8);
            str=str.substring(8,str.length());
            System.out.println(str2);
        }
    }
}
