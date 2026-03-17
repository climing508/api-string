package com.liaoying.a12ArrayListdemo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /*定义一个集合，添加数字，并进行遍历
        * 遍历格式参照：[元素1，元素2，元素3]*/
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i>=0&&i<list.size()-1) {
                System.out.print(list.get(i)+", ");
            }else {
                System.out.print(list.get(i)+"]");
            }
        }
        System.out.println();

    }
}
