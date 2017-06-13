package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 1 && a <= 9 && a % 2 == 0) System.out.print("четное однозначное число");
        if (a >= 1 && a <= 9 && a % 2 != 0) System.out.print("нечетное однозначное число");
        if (a >= 10 && a <= 99 && a % 2 == 0) System.out.print("четное двузначное число");
        if (a >= 10 && a <= 99 && a % 2 != 0) System.out.print("нечетное двузначное число");
        if (a >= 100 && a <= 999 && a % 2 == 0) System.out.print("четное трехзначное число");
        if (a >= 100 && a <= 999 && a % 2 != 0) System.out.print("нечетное трехзначное число");


    }
}
