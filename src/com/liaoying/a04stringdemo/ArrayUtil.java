package com.liaoying.a04stringdemo;

public class ArrayUtil {
    private ArrayUtil(){}
    public static String arrayToString(int arr[]){
        //定义字符串
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
        return str;
    }
}
