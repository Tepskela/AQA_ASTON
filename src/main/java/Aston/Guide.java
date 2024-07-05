package Aston;

import java.util.*;

public class Guide {
    private static Map<String, List<String>> guide = new HashMap<>();


    public void add(String name, String numberPhone) {
        if (guide.get(name) != null) {
            if (!guide.get(name).contains(numberPhone)) {
                guide.get(name).add(numberPhone);
            }
        } else {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(numberPhone);
            guide.put(name, arr);
        }
    }
    public List<String> get(String name) {
        return guide.getOrDefault(name, Collections.emptyList());
    }

//    private void get(String a) {
//    }

    public static void main(String[] args) {
        Guide phoneBook = new Guide();
        phoneBook.add("Петров", "89999999999");
        phoneBook.add("Иванов", "89888888888");
        phoneBook.add("Сидоров", "89888888887");
        phoneBook.add("Хрюков", "897815615191");
        System.out.println("Number Ivanov: " + guide.get("Петров"));
        System.out.println("Number Petrov: " + guide.get("Иванов"));
    }


}

