package com.liaoying.a04stringdemo;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //键入一个字符串，统计该字符串中大小写字母字符以及数字字符出现的次数（不考虑其他字符）

        //键入字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();

        //计数器思想
        int a=0;//记录小写字母数
        int b=0;//记录大写字母数
        int c=0;//记录数字数

        //遍历字符串
        for (int i = 0; i < str.length(); i++) {

            //str表示字符串中每一个被遍历到的字符
            char ch=str.charAt(i);

            //运用ASCII码表
            if (ch>='a'&&ch<='z'){
                a++;//小写
            } else if (ch>='A'&&ch<='Z') {
                b++;//大写
            } else if (ch>='0'&&ch<='9') {
                c++;//数字
            }else{
                System.out.println("当前字符不参与统计");
            }
        }

        //分别输出大小写字母字符以及数字字符出现的次数
        System.out.println("大写字母数为："+b);
        System.out.println("小写字母数为："+a);
        System.out.println("数字数为："+c);
    }
}
