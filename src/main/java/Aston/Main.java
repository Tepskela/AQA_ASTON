package Aston;

import java.util.Arrays;


public class Main {
    //не справился со второй задачей, долго трати на неё время. Если у других та же проблема, то может сможем строить созвон с разбором? Было бы интересно и полезно разобраться
    public static void main(String[] args) {
        String[][] arr = {{"1qwerty", "-999999999", "+3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "111111"}
        };

        try {
            int amount = amountArray(arr);
            System.out.println("Сумма чисел массива: " + amount);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int amountArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4*4");
        }

        int amount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    amount += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Невалидное значение в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return amount;
    }
}







