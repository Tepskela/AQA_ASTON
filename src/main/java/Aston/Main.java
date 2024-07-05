package Aston;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "one", "two"};

        Map<String, Integer> numbering = new HashMap<>();

        //Задание 1.1
        Set<String> unique = new LinkedHashSet<>(List.of(arr));
        System.out.println(unique);


        //Задание 1.2
        for (String number : arr) {
            numbering.put(number, numbering.getOrDefault(number, 0) + 1);
        }
        System.out.println(numbering);
    }
}







