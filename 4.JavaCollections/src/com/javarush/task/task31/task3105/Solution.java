package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Добавление файла в архив
*/
public class Solution {
    public static Map<ZipEntry, byte[]> entryMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        File fileName = new File(args[0]);
        File zipArchive = new File(args[1]);


        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipArchive))) {
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int count;

                while ((count = zipInputStream.read(buffer)) != -1) {
                    byteArrayOutputStream.write(buffer, 0, count);
                }
                byte[] bytes = byteArrayOutputStream.toByteArray();
                entryMap.put(zipEntry, bytes);
            }


            try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipArchive));
                 FileInputStream fileInputStream = new FileInputStream(fileName)) {
                boolean isExist = false;

                ZipEntry fileNameComparator = new ZipEntry(fileName.getName());

                for (Map.Entry<ZipEntry, byte[]> zipEntryEntry : entryMap.entrySet()) {
                    Path path = Paths.get(zipEntryEntry.getKey().getName());
                    if (!(path.getFileName().toString().equals(fileNameComparator.getName()))) {
                        zipOutputStream.putNextEntry(new ZipEntry(zipEntryEntry.getKey().getName()));
                        zipOutputStream.write(zipEntryEntry.getValue());
                    } else {
                        isExist = true;
                    }
                }
                if (isExist) {
                    ZipEntry addingFileEntry = new ZipEntry("new/" + fileName.getName());
                    zipOutputStream.putNextEntry(addingFileEntry);
                    byte[] buffer = new byte[fileInputStream.available()];
                    fileInputStream.read(buffer);
                    zipOutputStream.write(buffer);
                    zipOutputStream.closeEntry();
                }
            }
        }
    }
}