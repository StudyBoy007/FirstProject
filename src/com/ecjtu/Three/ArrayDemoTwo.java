package com.ecjtu.Three;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/5/30  10:10
 */
public class ArrayDemoTwo {
    public static void main(String[] args) {
        boolean juify=false;
        int index=0;
        int[]arrs={8,4,2,1,23,344,12};
        int sum=0;
        for (int i=0;i<arrs.length;i++){
            System.out.print(arrs[i]+" ");
            sum+=arrs[i];
        }
        System.out.println();
        System.out.println("数组的和为："+sum);
        System.out.println("请输入一个数字,查看数组中是否存在:");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        for (int i=0;i<arrs.length;i++){
            if(number==arrs[i]) {
                juify=true;
                index=i;
                break;
            }
        }
        System.out.println(juify?"数列中包含此数，在数组中的序号为："+index:"数组不包含此数");
    }
}
