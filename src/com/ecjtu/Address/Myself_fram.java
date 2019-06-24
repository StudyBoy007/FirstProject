package com.ecjtu.Address;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Create by czq
 * time on 2019/6/18  19:34
 */
public class Myself_fram extends JFrame implements Runnable, ActionListener {
    TextField output = new TextField("发送数据给别人:");
    TextArea input = new TextArea();
    Button b = new Button("发送数据到别人");

    public Myself_fram() throws IOException {
        super("我是自己");
        setSize(2000, 2000);
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
            InetAddress address = InetAddress.getLocalHost();
            Socket socket = new Socket(address, 6888);
            OutputStream os = socket.getOutputStream();
            PrintWriter writer1 = new PrintWriter(os);
            System.out.println(output.getText().trim());
            writer1.write(output.getText().trim());
            output.setText("");
            writer1.flush();
            socket.shutdownOutput();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(7888);
            while (true) {
                Socket socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String line;
                while ((line = br.readLine()) != null) {
                    input.append(line + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class myself {
    public static void main(String[] args) throws IOException {
        Myself_fram myself_fram = new Myself_fram();
        myself_fram.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);//正常退出jvm
            }
        });
        myself_fram.pack();

    }
}
