package com.BigHomeWork.ThreeHomeWork;

import com.BigHomeWork.ThreeHomeWork.Utility.CardUtil;

/**
 * Create by czq
 * time on 2019/6/30  21:22
 */
public class Test {
    public static void main(String[] args) {
        CardUtil cardUtil = new CardUtil();
        String[] newNumbers = cardUtil.getNewNumbers(10);
        for (String number:newNumbers){
            System.out.println(number);
        }
    }
}
