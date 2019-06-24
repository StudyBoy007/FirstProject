package com.ecjtu.io.Work;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by czq
 * time on 2019/6/19  15:30
 */
public class Work2 {
    public static List<String> imgpaths = new ArrayList<>();


    public static void main(String[] args) {

        File file = new File("e:\\Goodphoto");
        findImg(file);
        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;
        int index = 1;
        for (String path : imgpaths) {
            try {
                int b;
                bis = new BufferedInputStream(new FileInputStream(path));
                bos = new BufferedOutputStream(new FileOutputStream("File\\" + (index++) + ".jpg"));
                byte[] bytes = new byte[1024];
                int i;
                while ((i = bis.read(bytes, 0, bytes.length)) != -1) {
                    bos.write(bytes, 0, i);
                    bos.flush();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bis != null) {
                        bis.close();
                    }
                    if (bos != null) {
                        bos.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    public static void findImg(File dir) {
        if (!dir.exists()) {
            throw new IllegalArgumentException("目录" + dir + "不存在！");
        }
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException("该" + dir.getName() + "不是目录");
        }

        File[] files = dir.listFiles(new imgfilter("jpg"));
        for (File file : files) {
            imgpaths.add(file.getAbsolutePath());
        }
        File[] filess = dir.listFiles();
        for (File file : filess) {
            if (file.isDirectory()) {
                findImg(file);
            }
        }
    }
}

class imgfilter implements FilenameFilter {
    public String suffix;

    public imgfilter(String suffix) {
        this.suffix = "." + suffix;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(suffix);
    }
}

