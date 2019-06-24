package com.ecjtu.oneAndtwo;

public class Test2 {
    public static void main(String[] args) {
        int count=0;
        int enter=0;
        for (int i=2;i<=10000;i++){
            for (int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count>2){
                count=0;
                continue;
            }else {
                count=0;
                System.out.print(i+"  ");
                if(++enter%8==0){
                    System.out.println();
                }
            }

        }
    }
}
