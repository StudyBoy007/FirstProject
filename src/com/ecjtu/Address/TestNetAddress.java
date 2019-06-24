package com.ecjtu.Address;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Create by czq
 * time on 2019/6/18  9:25
 */
public class TestNetAddress {
    @Test
    public void testGetLocalHost(){
        try {
            InetAddress address=InetAddress.getLocalHost();
            System.out.println(address);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetAllByName(){
        try {
            InetAddress address[]=InetAddress.getAllByName("www.baidu.com");//填写域名
            for (InetAddress a:address){
                System.out.println(a);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
