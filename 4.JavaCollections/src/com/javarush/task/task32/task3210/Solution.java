package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {

        String fileName = args[0];
        int number = Integer.parseInt(args[1]); //long?
        String text = args[2];

        RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw");
        randomAccessFile.seek(number);
        byte[] bytes = new byte[text.length()];
        randomAccessFile.read(bytes, 0, text.length());
        randomAccessFile.seek(randomAccessFile.length());// lost this line
        if (convertByteToString(bytes).equals(text)) {
            randomAccessFile.write("true".getBytes());
        } else randomAccessFile.write("false".getBytes());
        randomAccessFile.close();
    }

    public static String convertByteToString(byte readBytes[]) {
        return new String(readBytes);
    }
}
