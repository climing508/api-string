package com.liaoying.a08stringdemo;

public class Test2 {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
    }
}
