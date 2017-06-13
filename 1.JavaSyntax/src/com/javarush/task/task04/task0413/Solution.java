package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(in);
        int weekDay = scanner.nextInt();
        if (weekDay == 1) {
            System.out.println("понедельник");
        } else if (weekDay == 2) {
            System.out.println("вторник");
        } else if (weekDay == 3) {
            System.out.println("среда");
        } else if (weekDay == 4) {
            System.out.println("четверг");
        } else if (weekDay == 5) {
            System.out.println("пятница");
        } else if (weekDay == 6) {
            System.out.println("суббота");
        } else if (weekDay == 7) {
            System.out.println("воскресенье");
        } else {
            System.out.println("такого дня недели не существует");
        }
    }
}