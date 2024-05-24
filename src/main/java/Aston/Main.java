package Aston;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        //sumOfTwoNumbers(10,5);
        System.out.println(sumOfTwoNumbersTask5(10, 11));
        verificationPositiveOrNegativeTask6(0);
        System.out.println(checkTrueFalseTask7(0));
        stringSpecifiedNumberOfTimesTask8("Ёж", 5);
        System.out.println(leapYearTask9(100));
        reverseNumbersTask10();
        fillingArrayTask11();
        multiplicationInArrayTask12();
        twoDimensionalArrayTask13();
        creatingArrayTask14(5, 10);
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a;
        int b;
        a = 10;
        b = -20;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 55;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println(a < b);
        }
    }

    public static boolean sumOfTwoNumbersTask5(int a, int b) {
//        int c = a + b;
        return (a + b >= 10) && (a + b <= 20);
    }

    public static void verificationPositiveOrNegativeTask6(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkTrueFalseTask7(int a) {
        return (a >= 0);
    }

    public static void stringSpecifiedNumberOfTimesTask8(String text, int a) {
        for (int b = 0; b < a; b++) {
            System.out.println(text);
        }
    }

    public static boolean leapYearTask9(int a) {
        if (a % 4 == 0 && a % 100 != 0) {
            return true;
        } else if (a % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void reverseNumbersTask10() {
        int[] reverseNumbers = new int[]{0, 1, 0, 1};

        for (int i = 0; i < reverseNumbers.length; i++) {
            if (reverseNumbers[i] == 0) {
                reverseNumbers[i] = 1;
            } else {
                reverseNumbers[i] = 0;
            }
            System.out.println(reverseNumbers[i]);
        }
    }

    public static void fillingArrayTask11() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

    public static void multiplicationInArrayTask12() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }

    public static void twoDimensionalArrayTask13() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][10 - 1 - i] = 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int[] creatingArrayTask14(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.println(arr[i]);
        }
        return arr;
    }
}

