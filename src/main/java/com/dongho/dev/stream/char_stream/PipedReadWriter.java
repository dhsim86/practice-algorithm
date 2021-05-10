package com.dongho.dev.stream.char_stream;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;

class InputThread extends Thread {

    private PipedReader pipedReader;

    InputThread(String name) {
        super(name);
    }

    public PipedReader getPipedReader() {
        return pipedReader;
    }

    public void open() {
        pipedReader = new PipedReader();
    }

    @Override
    public void run() {
        try (StringWriter sw = new StringWriter()) {

            int data = 0;

            while((data = pipedReader.read()) != -1) {
                sw.write(data);
            }

            pipedReader.close();

            System.out.println(getName() + ": " + sw.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class OutputThread extends Thread {

    private PipedWriter pipedWriter;

    OutputThread(String name) {
        super(name);
    }

    public PipedWriter getPipedWriter() {
        return pipedWriter;
    }

    public void open() {
        pipedWriter = new PipedWriter();
    }

    @Override
    public void run() {
        try {
            String msg = "Hello";

            pipedWriter.write(msg);
            pipedWriter.close();

            System.out.println(getName() + ": " + msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class PipedReadWriter {

    public static void main(String[] args) {
        InputThread inputThread = new InputThread("InputThread");
        OutputThread outputThread = new OutputThread("OutputThread");

        inputThread.open();
        outputThread.open();

        try {
            PipedReader pipedReader = inputThread.getPipedReader();
            PipedWriter pipedWriter = outputThread.getPipedWriter();

            pipedReader.connect(pipedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        inputThread.start();
        outputThread.start();

        try {
            inputThread.join();
            outputThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("completed.");
    }
}
