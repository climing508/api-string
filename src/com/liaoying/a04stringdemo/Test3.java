package com.liaoying.a04stringdemo;

public class Test3 {
    public static void main(String[] args) {
        //定义一个方法 ，把int数组中的数据按照指定格式拼接成一个字符串返回，调用该方法，并在控制台输出结果
        //int[] arr={1,2,3};
        //[1,2,3]

        //创建数组
        int[] arr={1,2,3};
        String s=ArrayUtil.arrayToString(arr);
        System.out.println(s);

        /*//定义字符串
        String str="";//字符串中内容未知时可先定义一个空字符串

        //给字符串赋值
        str=str+"[";

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (i<arr.length-1){
                str=str+arr[i]+",";
            }else {
                str=str+arr[i]+"]";
            }
        }
        System.out.println(str);*/
    }
}
