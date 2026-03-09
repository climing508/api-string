package com.liaoying.a08stringdemo;

public class Test3 {
    public static void main(String[] args) {
        //1、创建StringBuilder对象(容器)
        StringBuilder sb=new StringBuilder();

        //2、append()追加内容
        for (int i = 0; i < 20; i++) {
            sb.append("abcd");
        }
        System.out.println(sb);

        //3、reverse()反转
        sb.reverse();
        System.out.println(sb);

        //4、int length()返回长度
        int l = sb.length();
        System.out.println(l);

        //5、String toString()
        String sb1=sb.toString();
        System.out.println(sb1);
    }
}
