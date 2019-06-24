package com.BigHomeWork.FirstHomeWork.Test1Bank;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Create by czq
 * time on 2019/6/2  22:05
 */
public class Main {

    public static void main(String[] args)  {

        try {
            test1();
        }catch (Exception e){
            System.out.println(e);
        }


        System.out.println("exit...");
//        test1();
    }

    static void test1(){
        throw new UnCheck();
    }

    static void test() throws CheckException {
        throw new CheckException();
    }
}

class UnCheck extends RuntimeException{



}

class CheckException extends Exception{





}
