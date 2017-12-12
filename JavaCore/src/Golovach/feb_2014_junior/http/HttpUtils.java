package Golovach.feb_2014_junior.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * Created by APUST on 11/18/2017.
 */
public class HttpUtils {

//    public static byte[] readRequestFully(InputStream in) throws IOException {
//        byte[] buff = new byte[8192];
//        int headerLen = 0;
//
//        while(true){
//            int count = in.read(buff);
//            if(count < 0){
//                throw new RuntimeException("Incomming connection close");
//            } else {
//                headerLen += count;
//                if(isRequestEnd(buff, headerLen)){
//                    return Arrays.copyOfRange(buff, 0, headerLen);
//                }
//                if(headerLen == buff.length){
//                    throw new RuntimeException("Too big HTTP header");
//                }
//            }
//        }
//    }
//
//    public static byte[] createResponse(String text) {
//        String html = "";
//                + "<html>"
//
//    }
//

}
