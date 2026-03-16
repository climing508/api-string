package com.liaoying.a11ArrayListdemo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //1、创建一个长度为0的ArrayList集合
        //泛型：限定集合当中数据的类型<数据类型>
        ArrayList<String> al=new ArrayList<>();

        //增
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");

        al.add(1,"ddd");

        //删
        al.remove("aaa");
        al.remove(1);


        //改
        al.set(0,"abc");


        //查
        al.get(1);
        String s;
        //遍历
        for (int i = 0; i < al.size(); i++) {
            s = al.get(i);
            System.out.println(s);
        }
    }
}
