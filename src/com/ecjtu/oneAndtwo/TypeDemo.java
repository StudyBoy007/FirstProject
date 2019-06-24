package com.ecjtu.oneAndtwo;

public class TypeDemo {
    public static void main(String[] args) {
        double x;
        int q=1;
        for (int i = 0; i <= 5; i++) {
            if (i == 0) {
                for (int j = 0; j < 4; j++) {
                    if (j == 0) {
                        System.out.print("N ");
                    } else {
                        x = Math.pow(10, j);
                        int y = (int) x * q;
                        System.out.print(y + "*N  ");
                    }
                    if (j == 3) {
                        System.out.println();
                    }
                }
            } else {
                for (int j = 0; j < 4; j++) {
                    x = Math.pow(10, j);
                    int y = (int) x * i;
                    System.out.print(y + "   ");
                    if (j == 3) {
                        System.out.println();
                    }
                }
            }
        }
    }
}


