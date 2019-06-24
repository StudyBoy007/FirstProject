package com.ecjtu.Three;

/**
 * Create by czq
 * time on 2019/5/30  20:05
 */
public class Test7 {
    public static void main(String[] args) {
        Integer[] a = {1, 7, 9, 11, 13, 15, 17, 19};
        Integer[] b = {2, 4, 6, 8, 10};
        Object[] c = concatArray(a, b);
        for (Object obj:c){
            System.out.print(obj+" ");
        }
    }
    static Object[] concatArray(Object[] arra, Object[] arrb) {
        int al = arra.length;
        int b1 = arrb.length;
        int cl = al + b1;
        Object[] c = new Object[cl];
        for (int i=0;i<cl;i++){
            if(i<al){
                c[i] = arra[i];
            }else {
                c[i]=arrb[i-al];
            }
        }
        return c;
    }
}
