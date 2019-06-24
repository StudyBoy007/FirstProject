package com.ecjtu.Three;

import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/5/30  19:01
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入杨辉三角形的行数：");
        int number = input.nextInt();
        //定义二维数组
        int[][] arr = new int[number][];
        for (int i = 0; i < number; i++) {
            arr[i] = new int[i + 1];
        }
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == (i - 1)) {
                    System.out.print(1 + "  ");
                    arr[i - 1][j] = 1;
                    if (j == (i - 1)) {
                        System.out.println();
                    }
                } else {
                    int num = arr[i - 2][j] + arr[i - 2][j - 1];
                    System.out.print(num + "  ");
                    arr[i - 1][j] = num;
                    if (j == (i - 1)) {
                        System.out.println();
                    }
                }
            }
        }
    }
}
