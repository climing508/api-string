package com.liaoying.a07stringdemo;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        /*
           是否包含          contains(CharSequence s)
           (连续存在，比如abcd包含abc为true，但包含abd为false)
           判断开头、结尾     startsWith/endsWith
           查找              indexOf(int ch) 、lastIndexOf（int ch）
           判断是否为空       isEmpty()
           转字符数组         toCharArray()
           转换大小写         toUpperCase/toLowerCase()
           去除头尾空格       trim()
         */

        String str="abcdefg ";

        //判断是否包含abd
        boolean b=str.contains("abd");
        if(b==true){
            System.out.println("包含");
        }else {
            System.out.println("不包含");
        }

        //判断是否以abc开头
        boolean b2=str.startsWith("abc");
        System.out.println(b2);

        //判断从1索引开始是否以abc开头
        boolean b3=str.startsWith("abc",2);
        System.out.println(b3);

        //判断是否以d结尾
        boolean b4=str.endsWith("d");
        System.out.println(b4);

        //查找       indexOf(int ch) 第一次出现的索引
        // lastIndexOf（int ch） 最后一次出现的索引,查找内容不存在，返回-1
        int i=str.indexOf(97);  //查找a
        System.out.println(i);
        int i2=str.indexOf("A");  //查找a
        System.out.println(i2);   //-1,不存在

        //判断长度为0
        boolean b5=str.isEmpty();
        System.out.println(b5);

        //转字符数组    toCharArray()
        char[] arr=str.toCharArray();
        System.out.println(arr);

        //转换大小写         toUpperCase/toLowerCase()
        //           去除头尾空格       trim()
        String str2=str.toUpperCase();
        System.out.println(str2);

        String str3=" a a b c d ";
        System.out.println("'"+str3+"'");
        String str4=str3.trim();
        System.out.println("'"+str4+"'");
    }
}
