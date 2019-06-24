package com.BigHomeWork.FirstHomeWork.Test1Bank.bean;

/**
 * Create by czq
 * time on 2019/6/2  20:32
 */
public class OverdraftException extends RuntimeException {
    private double deficit;


    public OverdraftException(double deficit, String message) {
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }

}
