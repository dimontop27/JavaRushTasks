package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int k = 0;
        while (i < 3) {
            int number = Integer.parseInt(bufferedReader.readLine());
            i++;
            if (number > 0) {
                k++;
            }
        }
        System.out.println(k);
    }
}

