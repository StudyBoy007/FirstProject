package com.ecjtu.Address.udp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class Shanghai_Frame extends Frame implements Runnable, ActionListener
{
    TextField out_message=new TextField("发送数据到北京：");
    TextArea in_message=new TextArea();
    Button b=new Button("发送数据包到北京");
    Shanghai_Frame()
    {
        super("我是上海1111");
        setSize(1000,1000);
        setVisible(true);
        //js，给按钮绑定事件
        b.addActionListener(this);
        add(out_message,"South");
        add(in_message,"Center");
        add(b,"North");
        Thread thread=new Thread(this);
        thread.start();//线程负责接收数据包
    }

    //点击按扭发送数据包：
    public void actionPerformed(ActionEvent event)
    {
        byte buffer[]=out_message.getText().trim().getBytes();
        try{  InetAddress address=InetAddress.getByName("localhost");
            //数据包的目标端口是888(那么收方(北京)需在这个端口接收):
            DatagramPacket data_pack=new DatagramPacket(buffer,buffer.length, address,888);
            DatagramSocket mail_data=new DatagramSocket();
            // in_message.append("数据报目标主机地址:"+data_pack.getAddress()+"\n");
            //  in_message.append("数据报目标端口是:"+data_pack.getPort()+"\n");
            // in_message.append("数据报长度:"+data_pack.getLength()+"\n");
            mail_data.send(data_pack);
        }
        catch(Exception e){}
    }


    //接收数据包：
    public void run()
    {
        DatagramPacket pack=null;
        DatagramSocket mail_data=null;
        byte data[]=new byte[8192];
        try{
            pack=new DatagramPacket(data,data.length);
            //使用端口666来接收数据包(因为北京发来的数据报的目标端口是666)。
            mail_data=new DatagramSocket(666);
        }
        catch(Exception e){}
        while(true)
        {  if(mail_data==null) break;
        else
            try{  mail_data.receive(pack); //阻塞
                System.out.println("22222222222222222222222");
                int length=pack.getLength(); //获取收到的数据的实际长度。
                // InetAddress adress=pack.getAddress();//获取收到的数据包的始发地址。
                // int port=pack.getPort();//获取收到的数据包的始发端口。
                String message=new String(pack.getData(),0,length);
                // in_message.append("收到数据长度："+length+"\n");
                // in_message.append("收到数据来自："+adress+"端口："+port+"\n");
                in_message.append("收到数据是："+message+"\n");
            }
            catch(Exception e){}
        }
    }
}


public class shanghai
{  public static void main(String args[])
{
    Shanghai_Frame shanghai_win=new Shanghai_Frame();
    shanghai_win.addWindowListener(new WindowAdapter()
    {  public void windowClosing(WindowEvent e)
    {System.exit(0);
    }
    });
    shanghai_win.pack();
}
}
