package com.ecjtu.oneAndtwo;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

/**
 * Create by czq
 * time on 2019/5/30  9:08
 */
public class TestBreak {
    public static void main(String[] args) {
        out:
        for (int k=0;k<5;k++){
            for (int m=0;m<5;m++){
                System.out.println("k="+k+",m="+m);
                if(m==1){
                    continue out;
                }
            }
        }

    }
}
