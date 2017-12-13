
package com.apust.practic.inputouput;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * Created by GUN
 * on 18.06.2016.
 */
public class IOTest {
    public static void main(String[] args) throws IOException {

        //FILE.class
 /*       File file = new File("D:/TestGit/");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        String[] list = file.list();
        System.out.println(Arrays.asList(list));

        System.out.println(file.getAbsolutePath());*/

//------------------------- FileOutputStream
/*        int c = 0;
        try (FileInputStream fis = new FileInputStream("F:\\JavaSource\\Idea\\JavaCore\\src\\com.apust.geekbrains\\com.apust.practic\\inputouput\\IOTest.java")) {

            while (true) {
                c = fis.read();
                if (c == -1) break;
                System.out.print((char) c);
            }

        } catch (IOException e) {
            System.out.println("Проблема с файлом!");
        }*/


        //------------------------- FileOutputStream

// FileOutputStream fos = new FileOutputStream("D:\\testjava.txt")
  /*try (FileWriter fos = new FileWriter(String.valueOf(new FileOutputStream("D:\\testjava.txt")))) {
            while (fos.) {
                fos.write(c);
            }

        } catch (IOException e) {
            System.out.println("Проблема с файлом!");
        }

*/

// ------------------------ RandomAccessFile

        RandomAccessFile raf = new RandomAccessFile("F:\\JavaSource\\Idea\\JavaCore\\src\\com.apust.geekbrains\\com.apust.practic\\inputouput\\IOTest.java", "rw");
        raf.seek(raf.length());
        byte[] bytes = new byte[3];
        //raf.read(bytes,0,3);
        raf.write("//KU-KU".getBytes());
        System.out.println(Arrays.toString(bytes));

    }
}
//KU-KU//KU-KU