package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        File directory = new File(args[0]);
        File file = new File(args[1]);
        File allFilesContent = new File(file.getParent() + "/" + "allFilesContent.txt");
        FileUtils.renameFile(file, allFilesContent);
        try (FileOutputStream out = new FileOutputStream(file.getParent() + "/allFilesContent.txt");) {
            ArrayList<File> files = cleanDir(directory.listFiles());
            FileInputStream in;
            for (File each : files) {
                in = new FileInputStream(each);
                while (in.available() > 0) {
                    out.write(in.read());
                    out.flush();
                }
                out.write('\n');
                in.close();
            }
            out.close();
        }
    }

    public static ArrayList<File> cleanDir(File[] files) {
        ArrayList<File> allFiles = new ArrayList<>();
        for (File file : files) {
            if (file.isDirectory())
                allFiles.addAll(cleanDir(file.listFiles()));
            else if (file.isFile() && file.length() > 50)
                FileUtils.deleteFile(file);
            else if (file.isFile() && file.length() <= 50)
                allFiles.add(file);
        }
        Collections.sort(allFiles, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return allFiles;
    }

    public static void deleteFile(File file) {
        if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());
    }
}
