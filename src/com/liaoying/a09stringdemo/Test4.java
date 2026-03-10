package com.liaoying.a09stringdemo;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //定义一个任意的字符串，打乱里面的内容

        System.out.println("请输入一个字符串：");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Random r=new Random();
        char[] ch=str.toCharArray();
        char temp;
        for (int j = 0; j < ch.length; j++) {
            int num=r.nextInt(ch.length);
            temp=ch[j];
            ch[j]=ch[num];
            ch[num]=temp;
        }
        System.out.println(ch);
        String result=new String(ch);
        System.out.println(result);
    }
}
