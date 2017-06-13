package com.javarush.task.task34.task3403;

/* 
Разложение на множители с помощью рекурсии
*/
public class Solution {
    public void recursion(int n) {
        for (int k = 2; k <= n; k++) {
            if ((n % k) == 0) {
                if (n != k) {
                    System.out.print(k + " ");
                    recursion(n / k);
                } else {
                    System.out.print(k + " ");
                }
                break;
            }
        }
    }
}

