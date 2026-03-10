package com.liaoying.a09stringdemo;

public class Test {
    public static void main(String[] args) {
        /*定义一个方法，把int数组中的数据按照指定格式拼接成一个字符串返回，调用该方法，并在控制台输出结果*/
        int[] arr={1,2,3,4};
        System.out.println(Test.appendString(arr));

    }

    public static String appendString(int[] arr){
        //创建StringBuilder对象并添加“[”
        StringBuilder sb=new StringBuilder("[");
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if(i< arr.length-1){
                sb=sb.append(arr[i]+",");
            }else{
                sb=sb.append(arr[i]+"]");
            }
        }
        //转换成字符串
        String str=sb.toString();
        //返回字符串
        return str;
    }
}
