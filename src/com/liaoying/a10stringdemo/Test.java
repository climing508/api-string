package com.liaoying.a10stringdemo;

public class Test {
    public static void main(String[] args) {
        /*定义两个字符串，记录为非负整数，求他们的和*/
        String str1 = "12395";
        String str2 = "133";
        //判断str1和str2的长度，并将最长的长度赋值给len
        int len=str1.length()>=str2.length()?str1.length():str2.length();
        //创建两个数组存放字符串中的数据
        int[] arr1=sumString(str1,len);
        int[] arr2=sumString(str2,len);
        //输出arr1和arr2
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println();
        int num=0;//进位
        int[] sum=new int[len+1];//定义和数组
        //两数组相加，进位
        for (int i = arr1.length - 1; i >= 0; i--) {
            if(arr1[i]+arr2[i]>9){
                sum[i+1]=sum[i+1]+arr1[i]+arr2[i]-10;
                num=1;
                sum[i]=sum[i]+num;
            }else{
                sum[i+1]=sum[i+1]+arr1[i]+arr2[i];
            }
        }
        //输出和
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i]);
        }
    }

    public static int[] sumString(String str, int len) {
        //定义int数组
        int[]arr=new int[len];
        //定义变量表示数组应存入位置
        int i=arr.length-1;
        //把字符串中的数据依次放入数组中，倒着遍历
        for (int length = str.length()-1; length >= 0; length--) {
            char a = str.charAt(length);
            //将字符变成数字存入数组
            arr[i] = a - 48;
            i--;
        }
        return arr;
    }
}
