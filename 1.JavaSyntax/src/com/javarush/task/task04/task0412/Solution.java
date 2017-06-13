package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if (input>0)
            System.out.println(input*2);
        if (input<0)
            System.out.println(input+1);
        if(input==0)
            System.out.println(0);


    }

}