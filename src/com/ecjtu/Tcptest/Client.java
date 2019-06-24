package com.ecjtu.Tcptest;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Create by czq
 * time on 2019/6/18  20:42
 */
public class Client {
    static Socket socket;
    static OutputStream os;
    static PrintWriter pw;

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            socket = new Socket(address, 5555);
            os = socket.getOutputStream();
            pw = new PrintWriter(os);
            pw.write("我成功了\n");
            pw.flush();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (socket != null) {
                    socket.close();
                }
                if (os != null) {
                    os.close();
                }
                if (pw != null) {
                    pw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
