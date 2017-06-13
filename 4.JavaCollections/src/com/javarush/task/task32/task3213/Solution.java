package com.javarush.task.task32.task3213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor Dpljr");
        System.out.println(decode(reader, -3));  //Hello Amigo

    }

    public static String decode(StringReader reader, int key) throws IOException {
        if (reader == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();

        int temp;
        while ((temp = reader.read()) != -1) {
            sb.append((char) (temp + key)).toString();
        }

        return sb.toString();
    }
}

