package com.dongho.dev.stream.byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {

    public static void main(String[] args) {
        String srcFileName = "E:\\Downloads\\tmp.txt";
        String destFileName = "E:\\Downloads\\dest.txt";

        try (FileInputStream fis = new FileInputStream(srcFileName);
             FileOutputStream fos = new FileOutputStream(destFileName)) {

            while (fis.available() > 0) {
                fos.write(fis.read());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: "+ e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(srcFileName + " -> " + destFileName + " has been completed.");
    }

}
