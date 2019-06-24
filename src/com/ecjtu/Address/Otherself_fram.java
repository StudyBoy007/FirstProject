package com.ecjtu.Address;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Create by czq
 * time on 2019/6/18  20:16
 */
public class Otherself_fram extends Frame implements Runnable, ActionListener {
    TextField output = new TextField("发送数据给别人:");
    TextArea input = new TextArea();
    Button b = new Button("发送数据到别人");

    public Otherself_fram() {
        super("我是别人");
        setSize(200, 200);
        setVisible(true);
        b.addActionListener(this);
        add(output, "South");
        add(input, "Center");
        add(b, "North");
        Thread thread = new Thread(this);
        thread.start();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            InetAddress address= InetAddress.getLocalHost();
            Socket socket = new Socket(address, 7888);
            OutputStream os = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(os);
            writer.write(output.getText().trim());
            output.setText("");
            writer.flush();
//            socket.shutdownOutput();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //别人的服务端
    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(6888);
            System.out.println("别人的服务器开启了---");
            while (true) {
                Socket socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    input.append(line+"\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class otherself {
    public static void main(String[] args) {
        Otherself_fram otherself_fram = new Otherself_fram();
        otherself_fram.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);//正常退出jvm
            }
        });
        otherself_fram.pack();

    }
}