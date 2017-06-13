package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        double sum = 0;
        double count = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int a = Integer.parseInt(bufferedReader.readLine());
            if (a == -1)
                break;
            else
                count++;
            sum = sum + a;
        }
        System.out.println(sum / count);

    }

}


