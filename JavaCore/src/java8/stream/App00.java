package java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by APUST on 10/29/2017.
 */
public class App00 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "BB", "CC", "AB", "BC", "CA AB", "CA");
        System.out.println(getString(list));

        list.stream().filter(s -> s.contains("CC"));

    }


    public static String getString(Collection<String> collection) {
        for(String str : collection){
            if(str.contains("AB")){
                return str;
            }
        }
        return null;
    }
}
