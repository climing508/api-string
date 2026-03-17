package com.liaoying.a13ArrayListdemo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /*定义集合，添加一些学生对象
        * 学生的属性包括：id、姓名、年龄
        * 要求：
        * 1、遍历集合，将所有学生的属性打印在控制台上，每个学生一行
        * 2、定义一个方法，根据id查找学生的信息。
        * 存在：返回索引
        * 不存在：返回-1
        */
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("狂客归洲","萧逸",25));
        list.add(new Student("爷傲奈我何","查理苏",28));
        list.add(new Student("沉睡大陆","陆沉",26));
        list.add(new Student("齐","齐司礼",3000));
        list.add(new Student("盛夏之星","夏鸣星",21));
        for (int i = 0; i < list.size(); i++) {
            list.get(i).Print();
        }
        System.out.println(findStudent("狂客归洲",list));
    }
    public static int findStudent(String id,ArrayList<Student> list){
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            //判断equals--链式编程：多行代码写在一行（少定义几个变量）
            //核心逻辑：利用前一个方法的结果调用后一个方法
            if(stu.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
