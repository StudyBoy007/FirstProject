package com.ecjtu.Three;

/**
 * Create by czq
 * time on 2019/5/30  15:09
 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr = {12, 23, 11, 56, 23, 78, 34, 123, 343, 1, 3, 4, 32, 23, 67};
        int maxnum = arr[0];
        int maxindex=0;
        int minnum = maxnum;
        int minindex=0;
        for (int i = 0; i < arr.length; i++) {
            if (maxnum < arr[i]) {
                maxnum = arr[i];
                maxindex=i;
            }
            if (minnum >arr[i]) {
                minnum = arr[i];
                minindex=i;
            }
        }
        System.out.println("第一问答案如下：");
        System.out.println("该数组中最大的数为："+maxnum+",对应的数组下标为："+maxindex);
        System.out.println("该数组中最小的数为："+minnum+",对应的数组下标为："+minindex);
        System.out.println("第二问答案如下：");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int temp=0;
        temp=arr[0];
        arr[0]=arr[maxindex];
        arr[maxindex]=temp;
        temp=arr[arr.length-1];
        arr[arr.length-1]=arr[minindex];
        arr[minindex]=temp;
        System.out.println("第三问答案如下：");
        for (int c:arr){
            System.out.print(c+" ");
        }
    }
}
