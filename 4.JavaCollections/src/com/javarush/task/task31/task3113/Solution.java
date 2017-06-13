package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Что внутри папки?
*/
public class Solution {
    static long Size;
    static int CountFiles = 0;
    static long FoldersInFolder = 0;
    static Path folder;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String directoryPath = reader.readLine();
        folder = Paths.get(directoryPath);
        reader.close();

        if (!Files.isDirectory(folder)) {
            directoryPath = folder.toAbsolutePath().toString();
            System.out.println(directoryPath + "- не папка");
            return;
        }


    }
}
