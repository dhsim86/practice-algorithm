package com.dongho.dev.stream.byte_stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArray {

    public static void main(String[] args) {
        byte[] inSrc = new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outDest = null;

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        while (byteArrayInputStream.available() > 0) {
            byteArrayOutputStream.write(byteArrayInputStream.read());
        }

        outDest = byteArrayOutputStream.toByteArray();

        System.out.println("result:" + Arrays.toString(outDest));
    }

}
