package com.ecjtu.Three;

/**
 * Create by czq
 * time on 2019/5/30  9:55
 */
public class AarrayDemo {
    public static void main(String[] args) {
        //声明数组
        int arr[];//或者int []arr
        //分配空间
        arr=new int[3];
        //赋值
        int arr2[]={11,12,13};
        int arr3[]=new int[]{11,12,13};
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

    }
}
