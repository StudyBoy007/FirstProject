package com.ecjtu.oneAndtwo;

public class Test {
    public static void main(String[] args) {
        //case 后面可以是整形，可以是字符型，可以是字符串
        String a = "aa";
        System.out.println(a);
        switch (a) {
            case "aa":
                System.out.println("hello world");
                break;
            default:
                System.out.println("nonononoono~");
                break;
        }
    }
}
