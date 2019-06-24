package com.ecjtu.Address.LastWork;

import java.io.IOException;
import java.net.*;

/**
 * Create by czq
 * time on 2019/6/18  11:18
 */
public class Client {
    public static void main(String[] args) {
        try {
            int port = 9990;
            InetAddress address = InetAddress.getLocalHost();
            byte[] bytes = "李飞是个傻逼".getBytes();
            DatagramSocket socket = new DatagramSocket();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, port);
            socket.send(packet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
