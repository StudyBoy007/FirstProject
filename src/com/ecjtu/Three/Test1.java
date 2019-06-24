package com.ecjtu.Three;

import jdk.internal.util.xml.impl.Input;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create by czq
 * time on 2019/5/30  11:15
 */
public class Test1 {
    public static void main(String[] args) {
        char[] chars = {'c', 'a', 'b', 'g', 'e', 'h'};
        System.out.print("原字符序列：");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
        Arrays.sort(chars);
        System.out.print("升序排列后：");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.print("倒序排列后：");
        reverse(chars);
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.print("待插入的字符为：");
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        int index = chars.length;
        for (int i = 0; i < chars.length; i++) {
            if (c > chars[i]) {
                index = i;
                break;
            }
        }
        System.out.print("插入字符的下标为：" + index);
        System.out.println();
        char[] chars1 = new char[chars.length + 1];
        for (int i = chars1.length - 1; i > index; i--) {
            chars1[i] = chars[i - 1];
        }
        chars1[index] = c;
        for (int i = 0; i < index; i++) {
            chars1[i] = chars[i];
        }
        System.out.print("插入后的字符序列是：");
        for (char c1 : chars1) {
            System.out.print(c1 + " ");
        }
        System.out.println();

    }

    public static char[] reverse(char[] array) {
        char temp = 0;
        int number = array.length;
        for (int i = 0; i < (number / 2); i++) {
            temp = array[i];
            array[i] = array[number - 1 - i];
            array[number - 1 - i] = temp;
        }
        return array;
    }
}
