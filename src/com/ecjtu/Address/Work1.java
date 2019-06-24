package com.ecjtu.Address;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Create by czq
 * time on 2019/6/18  15:54
 */
public class Work1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://img.5nd.com/photo/2019album/20196/92159.jpg");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\GoodPhoto\\newimg.jpg"));
            byte[] bytes = new byte[1024];
            int i;
            while ((i = bis.read(bytes, 0, bytes.length)) != -1) {
                bos.write(bytes, 0, i);
                bos.flush();
            }
            bos.close();
            bis.close();
            is.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
