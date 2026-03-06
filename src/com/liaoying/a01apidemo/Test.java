package com.liaoying.a01apidemo;

//导包：定义Random的位置
//什么情况不需要导包：
//1、使用本包中的类
//2、使用java.lang包中的类（最基础）
import java.util.Random;
public class Test {
    public static void main(String[] args) {

        //需求：查询API帮助文档，使用Random类获取随机小数的方法

        //1、创建Random对象
        Random r=new Random();

        //2、调用方法获取随机小数
        //范围[0.0,1.0)
        //ctr+alt+v自动生成左边
        double num1 = r.nextDouble();
        System.out.println(num1);

        //[0.0,范围)   JDK17后才有
        double num2 = r.nextDouble(9);
        System.out.println(num2);

        //[开始,结束)
        double num3 = r.nextDouble(3,9);
        System.out.println(num3);

        System.out.println("-----------------");

        for (int i=1;i<=100;i++){
            double num4=r.nextDouble(3.5,4);
            System.out.println(num4);
        }
    }



}
