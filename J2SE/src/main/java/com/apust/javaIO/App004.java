package com.apust.javaIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * Created by APUST on 7/10/2017.
 */
public class App004 {
    public static void main(String[] args) throws IOException{
        InputStream inputStream = new URL("https://www.tut.by").openStream();
        OutputStream outputStream = new FileOutputStream("f:/JavaSource/Idea/JavaCore/Test/tut.txt");
        copy(inputStream, outputStream);
    }


    public static void copy(InputStream is, OutputStream os) throws IOException {
        while(true){
            int data = is.read();
            if(data != -1){
                os.write(data);
            } else {
                return;
            }
        }
    }
}
