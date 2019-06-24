package com.ecjtu.Address.LastWork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Create by czq
 * time on 2019/6/18  11:18
 */
public class Server {
    public static void main(String[] args) {

        try {
            DatagramSocket socket = new DatagramSocket(9990);
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length);
            socket.receive(packet);
            String info = new String(packet.getData());
            System.out.println(info);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
