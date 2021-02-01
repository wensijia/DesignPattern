package com.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName : ServerDemo
 * @Description : 服务器
 * @Author : wen_sijia
 * @Date: 2021-02-01 10:13
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        System.out.println("111");
        Socket accept = ss.accept();
        System.out.println("222");
        InputStream is = accept.getInputStream();
        int b;
        while ((b= is.read())!= -1){
            System.out.print((char)b);
        }
        is.close();
        ss.close();
    }
}
