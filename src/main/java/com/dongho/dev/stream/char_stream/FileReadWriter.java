package com.dongho.dev.stream.char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriter {

    public static void main(String[] args) {
        String srcFileName = "E:\\Downloads\\tmp.txt";
        String destFileName = "E:\\Downloads\\dest.txt";

        try (FileReader fileReader = new FileReader(srcFileName);
             FileWriter fileWriter = new FileWriter(destFileName)) {

            int data = 0;
            while((data = fileReader.read()) != -1) {
                fileWriter.write(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: "+ e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(srcFileName + " -> " + destFileName + " has been completed.");
    }

}
