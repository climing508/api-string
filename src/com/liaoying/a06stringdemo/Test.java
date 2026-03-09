package com.liaoying.a06stringdemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //用String replace(旧，新)；替换游戏发言中骂人的脏话

        //键入评论
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入评论：");
        String mes=sc.next();

        //建立敏感词库
        String[] arr={"sb","傻逼","你妈","我操","他妈的","TMD","cnm","你他妈","奶奶的","垃圾"};

        //替换敏感词
        for (int i = 0; i < arr.length; i++) {
                mes=mes.replace(arr[i],"***");
        }
        System.out.println(mes);
    }
}
