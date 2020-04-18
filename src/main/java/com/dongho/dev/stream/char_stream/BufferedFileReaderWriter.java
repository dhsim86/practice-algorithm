package com.dongho.dev.stream.char_stream;

import java.io.*;

public class BufferedFileReaderWriter {

    public static void main(String[] args) {
        String srcFileName = "E:\\Downloads\\tmp.txt";
        String destFileName = "E:\\Downloads\\dest.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFileName));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFileName))) {

            int data = 0;
            while((data = bufferedReader.read()) != -1) {
                 bufferedWriter.write(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: "+ e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(srcFileName + " -> " + destFileName + " has been completed.");
    }

}
