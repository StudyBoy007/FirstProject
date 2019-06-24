package com.ecjtu.oneAndtwo;

/**
 * Create by czq
 * time on 2019/5/29  16:35
 */
public class Test4 {
    public static void main(String[] args) {
        int enter=1;
        for (int i=101;i<1000;i++){
            int a=i%10;
            int b=(i/10)%10;
            int c=(i/100)%10;
            int sum=(int)(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3));
            if(i==sum){
                System.out.print(i+" ");
                if(++enter%5==0){
                    System.out.println();
                }
            }
        }
    }
}
