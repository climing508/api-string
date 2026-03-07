package com.liaoying.a04stringdemo;

public class Test {
    public static void main(String[] args) {
        /*public char charAt(int index);根据索引返回字符串
        public int length();返回此字符串长度

        需求：键盘录入一个字符串，使用程序实现在控制台对其遍历*/

        //定义字符串
        String s1="ZhangSan你好";

        //返回字符串长度
        int a=s1.length();
        System.out.println("字符串长度为："+a);
        //遍历字符串
        for (int i = 0; i < a; i++) {
            char s2=s1.charAt(i);
            System.out.println(s2);
        }

    }
}
