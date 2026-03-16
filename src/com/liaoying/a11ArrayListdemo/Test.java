package com.liaoying.a11ArrayListdemo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //1、创建一个长度为0的ArrayList集合
        //泛型：限定集合当中数据的类型<数据类型>
        ArrayList<String> al=new ArrayList<>();

        //增
        //返回始终为true，为了与其他集合保持一致设置的boolean，面向对象思想
        //在末尾添加元素
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");
        //在指定索引上添加元素
        //若索引不存在，报错
        al.add(1,"ddd");

        //删
        //删除指定元素
        al.remove("aaa");
        //删除指定索引的元素
        //若索引不存在，报错
        al.remove(1);


        //改
        //修改指定索引上的元素
        al.set(0,"abc");


        //查
        //查询指定索引上的元素
        al.get(1);
        String s;
        //遍历
        //与System.out.println(al);的区别是，遍历直接把元素单独拿出来，可用来打印、赋值等等
        for (int i = 0; i < al.size(); i++) {
            s = al.get(i);
            System.out.println(s);
        }
    }
}
