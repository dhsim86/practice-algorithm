package com.dongho.dev.stream.char_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReadWriter {

    public static void main(String[] args) {

        System.out.print("input: ");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            String line = bufferedReader.readLine();
            System.out.println("output: " + line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
