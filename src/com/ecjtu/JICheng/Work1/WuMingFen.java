package com.ecjtu.JICheng.Work1;

/**
 * Create by czq
 * time on 2019/6/3  14:07
 */
public class WuMingFen {
    private String theMa;
    private int quantity;
    private boolean likeSoup;

    public WuMingFen(String theMa, int quantity, boolean likeSoup) {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }

    public WuMingFen(String theMa, int quantity) {
        this.theMa = theMa;
        this.quantity = quantity;
    }

    public WuMingFen() {
    }

    public String getTheMa() {
        return theMa;
    }

    public void setTheMa(String theMa) {
        this.theMa = theMa;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isLikeSoup() {
        return likeSoup;
    }

    public void setLikeSoup(boolean likeSoup) {
        this.likeSoup = likeSoup;
    }

    public void check(){
        System.out.println("该粉的类型为："+this.getTheMa()+","+this.getQuantity()+"两,"+this.isLikeSoup());
    }
}
