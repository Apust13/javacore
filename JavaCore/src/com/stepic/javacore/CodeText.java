package com.stepic.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by GUN on 11/18/2015.
 */
public class CodeText {
    public static char rot13(char c){
        if((c>='A')&&(c<='Z')){
            c+=13;
            if(c>'Z') c -=26;
        }
        if((c>='a')&&(c<='z')){
            c+=13;
            if(c>'z')c-=26;
        }
        return c;

    }

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            System.out.print("> ");
            String line = in.readLine();
            if((line == null) || line.equalsIgnoreCase("quit")){
                break;
            }
            StringBuffer buf = new StringBuffer(line);
            for(int i = 0; i<buf.length(); i++){
                buf.setCharAt(i, rot13(buf.charAt(i)));

            }
            System.out.println(buf);
        }
    }
}
