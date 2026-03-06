package com.liaoying.a02stringdemo;

public class Test {
    public static void main(String[] args) {
        //直接创建
        String name = "王霸天";
        System.out.println(name);
        //new+构造方法->创建字符串对象

        //1、new+空参构造
        String s1 = new String();
        System.out.println("--" + s1 + "@@");

        //2、new+有参构造
        String s2 = new String(name);
        System.out.println(s2);

        //3、new+有参构造（字符数组）
        char[] chs = {'a', 'b', 'c', 'd'};
        String s3 = new String(chs);
        System.out.println(s3);

        //4、new+有参构造（字节数组）
        byte[] bytes = {62, 1, 94, 64, 101, 102};//ASCII码
        String s4 = new String(bytes);
        System.out.println(s4);
    }
}
