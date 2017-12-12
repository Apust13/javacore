package geekbrains.practic.dublicator;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by GUN
 * on 21.06.2016.
 */
public class Dublicator {

    static int compare(File f1, File f2) throws IOException {

        try (FileInputStream fis1 = new FileInputStream(f1);
             FileInputStream fis2 = new FileInputStream(f2)) {

            while (true) {
                int b1 = fis1.read();
                int b2 = fis2.read();
                if(b1 == -1 && b2 == -1)return 0;

                if (b1 != b2) return b1 - b2;


            }
        }
    }

    public static void main(String[] args) throws IOException {
        int q = compare(new File("./a.txt"),new File("./b.txt"));
        System.out.println(q);

        File folder = new File("D:\\Test");
        File[] files = folder.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });

        for(int i = 0; i <files.length; i++){
            for(int j = i+1; j<files.length; j++){
                if(compare(files[i], files[j]) == 0){
                    System.out.println("Files " + files[i].getAbsolutePath() + " and " + files[j].getAbsolutePath() + " are equals");
                }
            }
        }


    }


}




