package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        Scanner scanner = new Scanner(System.in);
//        int i = 0;
//        int positive = 0;
//        int negative = 0;
//        while (i < 3) {
//            int n = scanner.nextInt();
//            i++;
//            if (n > 0) {
//                positive++;
//            } else if (n < 0) {
//                negative++;
//            }
//        }
//        System.out.println("количество отрицательных чисел:" + negative);
//        System.out.println("количество положительных чисел:" + positive);
//    }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        for (int i = 0; i < 3; i++) {
            int c = Integer.parseInt(br.readLine());
            if (c < 0) a++;
            else {
                if (c > 0) b++;
            }
        }
        System.out.println("количество отрицательных чисел: " + a);
        System.out.print("количество положительных чисел: " + b);
    }
}
