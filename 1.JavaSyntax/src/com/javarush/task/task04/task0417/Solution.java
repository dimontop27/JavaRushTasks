package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        if (a == b && c == a)
            System.out.println(a + " " + b + " " + c);
        else if (a == b)
            System.out.println(a + " " + b);
        else if (a == c)
            System.out.println(a + " " + c);
        else if (c == b)
            System.out.println(c + " " + b);

    }
}
/*
Scanner keyboard = new Scanner(System.in);
int i1 = keyboard.nextInt();
int i2 = keyboard.nextInt();
int i3 = keyboard.nextInt();

if ( i1 == i2 && i2 == i3) {System.out.println(i1 +" "+ i2 +" "+ i3);}
else if ( i1 == i2 ) {System.out.println(i1 +" "+ i2);}
else if ( i2 == i3 ) {System.out.println(i2 +" "+ i3);}
else if ( i1 == i3 ) {System.out.println(i1 +" "+ i3);}

 */