package com.liaoying.a08stringdemo;

public class Test1 {
    public static void main(String[] args) {

        long start=System.currentTimeMillis();    //统计代码开始运行的时间

        String s="";
        for (int i = 0; i < 1000000; i++) {
            s=s+"abc";
        }
        System.out.println(s);
        long end=System.currentTimeMillis();    //统计代码运行结束的时间

        System.out.println(end-start);         //单位：毫秒   1s=1000ms
    }
}
