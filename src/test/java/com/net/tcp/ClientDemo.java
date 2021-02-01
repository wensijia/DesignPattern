package com.net.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName : ClientDemo
 * @Description : 客户端
 * @Author : wen_sijia
 * @Date: 2021-02-01 10:11
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10000);
        OutputStream os = socket.getOutputStream();
        os.write("hello".getBytes());
        os.close();
        socket.close();
    }
}
