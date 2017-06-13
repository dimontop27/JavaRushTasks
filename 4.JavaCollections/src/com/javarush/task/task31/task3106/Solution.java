package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            return;
        }
        String resultFileName = args[0];

        int filePartCount = args.length - 1;
        String[] fileNamePart = new String[filePartCount];
        for (int i = 0; i < filePartCount; i++)
        {
            fileNamePart[i] = args[i + 1];
        }
        Arrays.sort(fileNamePart);

        List<FileInputStream> fileNameParts = new ArrayList<>();
        for (int i = 0; i < filePartCount; i++)
        {
            fileNameParts.add(new FileInputStream(fileNamePart[i]));
        }
//
//        List fileNameParts = new ArrayList();
//        for (int i = 1; i < args.length; i++) {
//            fileNameParts.add(new FileInputStream(args[i]));
//        }
//        SequenceInputStream seqInStream = new SequenceInputStream(Collections.enumeration(fileNameParts));
//        ZipInputStream zipInStream = new ZipInputStream(seqInStream);
        ZipInputStream zipInStream = new ZipInputStream(new SequenceInputStream(Collections.enumeration(fileNameParts)));
        FileOutputStream fileOutStream = new FileOutputStream(resultFileName);

        byte[] buffer = new byte[1024];
        while (zipInStream.getNextEntry() != null) {
            int count;
            while ((count = zipInStream.read(buffer)) != -1) {
                fileOutStream.write(buffer, 0, count);
            }
        }

        zipInStream.close();
        fileOutStream.close();
    }
}

//        try {
////            OutputStream os = new BufferedOutputStream(new FileOutputStream(resultFileName));
//            FileOutputStream fos = new FileOutputStream(resultFileName);
//            try {
//                byte[] buffer = new byte[1024];
//                for (int readBytes; (readBytes = is.read(buffer, 0, 1024)) > -1; ) {
//                    fos.write(buffer, 0, readBytes);
//                }
//                fos.flush();
//            } finally {
//                fos.close();
//            }
//        } finally {
//            is.close();
//        }


       /* ZipInputStream is = new ZipInputStream(new SequenceInputStream(Collections.enumeration(fileNameParts)));

        try {
            for (ZipEntry entry = null; (entry = is.getNextEntry()) != null; ) {
                OutputStream os = new BufferedOutputStream(new FileOutputStream(entry.getName()));
                try {
                    byte[] buffer = new byte[1024];
                    for (int readBytes; (readBytes = is.read(buffer, 0, 1024)) > -1; ) {
                        os.write(buffer, 0, readBytes);
                    }
                    os.flush();
                } finally {
                    os.close();
                }
            }
        } finally {
            is.close();
        }

    }
}
*/

/*
try {
            for (ZipEntry entry = null; (entry = is.getNextEntry()) != null; ) {
                OutputStream os = new BufferedOutputStream(new FileOutputStream(entry.getName()));
                try {
                    byte[] buffer = new byte[1024];
                    for (int readBytes; (readBytes = is.read(buffer, 0, 1024)) > -1; ) {
                        os.write(buffer, 0, readBytes);
                    }
                    os.flush();
                } finally {
                    os.close();
                }
            }
        } finally {
            is.close();
        }

 */