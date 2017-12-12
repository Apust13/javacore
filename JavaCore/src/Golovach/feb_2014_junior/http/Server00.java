package Golovach.feb_2014_junior.http;

import com.sun.deploy.net.HttpUtils;
import sun.nio.cs.US_ASCII;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by APUST on 11/18/2017.
 */
public class Server00 {
//
//    public static void main(String[] args) throws IOException {
//
//        ServerSocket serverSocket = new ServerSocket(80);
//
//        while (true){
//            System.out.println("wait for TCP-connection ...");
//
//            Socket socket = serverSocket.accept();
//
//            System.out.println("get one!");
//
//            try(InputStream in = socket.getInputStream();
//                OutputStream out = socket.getOutputStream()) {
//
//                byte[] request = HttpUtils.readRequestFully(in);
//                System.out.println(" - - - - - - - - - - - - ");
//                System.out.println(new String(request, US_ASCII));
//                System.out.println(" - - - - - - - - - - - - ");
//
//                byte[] response = new Date().toString().getBytes(US_ASCII);
//                out.write(response);
//
//
//            } finally {
//                socket.close();
//            }
//
//
//        }
//
//
//
//    }

}
