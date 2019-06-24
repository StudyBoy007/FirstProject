package com.ecjtu.Three;

import java.util.Arrays;

/**
 * Create by czq
 * time on 2019/5/30  15:44
 */
public class Test4 {
    public static void main(String[] args) {
        Integer[][] arr={{17,23,1,5},{8,9},{34,35,56}};
        Object newarr[]=TwoToOne(arr);
        for (Object obj:newarr){
            System.out.print(obj+" ");
        }
    }

    public static Object[] TwoToOne(Object[][] arr) {
        int sum = 0;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].length;
            sum += a;
        }
        sum=sum+arr.length;
        Object[]newarr=new Object[sum];
        for (int i=0;i<arr.length;i++){
            newarr[index++]=arr[i].length;
            for (int j=0;j<arr[i].length;j++){
                newarr[index++]=arr[i][j];
            }
        }
        return newarr;
    }

}
