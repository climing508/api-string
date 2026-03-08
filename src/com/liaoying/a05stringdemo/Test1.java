package com.liaoying.a05stringdemo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*public String substring(int beginIndex,int endIndex);     截取到指定范围（不包含结束字符）
        * public String substring(int beginIndex);          从指定位置截取到末尾
        *
        * 需求：只保留用户名第一个字符，后面部分用***代替
        * */

        //键入用户名
        System.out.println("请输入用户名:");
        Scanner sc=new Scanner(System.in);
        String username=sc.next();
        //截取
        String str=username.substring(0,1);
        //拼接
        str=str+"***";
        System.out.println(str);

        /*String str2=username.substring(2);
        System.out.println(str2);*/

    }
}
