package com.dongho.dev.stream.byte_stream;

import java.io.*;

public class BufferedFileStream {

    public static void main(String[] args) {
        String srcFileName = "E:\\Downloads\\tmp.txt";
        String destFileName = "E:\\Downloads\\dest.txt";

        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(srcFileName));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFileName))) {

            while (bin.available() > 0) {
                bos.write(bin.read());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: "+ e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(srcFileName + " -> " + destFileName + " has been completed.");
    }

}
