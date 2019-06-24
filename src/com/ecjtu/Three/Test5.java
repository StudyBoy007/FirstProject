package com.ecjtu.Three;

/**
 * Create by czq
 * time on 2019/5/30  18:47
 */
public class Test5 {
    public static void main(String[] args) {
        //计算0的个数
        int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int count=0;
        for (int i=0;i<oldArr.length;i++){
            if(oldArr[i]==0){
                count++;
            }
        }
        System.out.println("0的个数为："+count);
        //创建一个新的数组
        int index=0;
        int[]newarr=new int[oldArr.length-count];
        for (int i=0;i<oldArr.length;i++){
            if(oldArr[i]!=0){
                newarr[index++]=oldArr[i];
            }
        }
        for (int num:newarr){
            System.out.print(num+" ");
        }
    }
}
