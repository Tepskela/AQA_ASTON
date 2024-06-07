package Aston;

import java.util.Arrays;


public class Main {
    //не справился со второй задачей, долго трати на неё время. Если у других та же проблема, то может сможем строить созвон с разбором? Было бы интересно и полезно разобраться
    public static void main(String[] args) {
        Animals animals = new Animals("Ёж", 10);
        Cat cat1 = new Cat("Джери", 100);
        Cat cat2 = new Cat("Тимофей", 1000);
        Dog dog1 = new Dog("Рекс", 100);
        int addFod = 10;

        cat2.run(100);
        cat1.swim(100);
        dog1.swim(20);

        Cat[] cats = {new Cat("Барсик", 100), new Cat("Тимофей", 20), new Cat("Кот", 100)};
        for (Cat cat : cats) {
            cat.eat(50);
        }

        System.out.println("Сытость котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.satiety ? "сыт" : "голоден"));
        }
    }
}


