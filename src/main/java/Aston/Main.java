package Aston;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    protected static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Число не может быть отрицательным");
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        if (factorial < 0) throw new ArithmeticException("Overflow occurred");
        return factorial;
    }
}