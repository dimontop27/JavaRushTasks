package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(bufferedReader.readLine());
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
            System.out.println("количество дней в году: 366");
        } else System.out.println("количество дней в году: 365");
    }
}
/*
if ((num%100!=0 && num%4==0) || num%400==0)
System.out.println("количество дней в году: 366");
else
System.out.println("количество дней в году: 365");
 */