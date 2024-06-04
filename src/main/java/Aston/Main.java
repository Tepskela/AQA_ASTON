package Aston;

import java.util.Arrays;


public class Main {
    //не справился со второй задачей, долго трати на неё время. Если у других та же проблема, то может сможем строить созвон с разбором? Было бы интересно и полезно разобраться
    public static void main(String[] args) {
        Animals animals = new Animals("Ёж");
        Cat cat1 = new Cat("Джери");
        Cat cat2 = new Cat("Тимофей");
        Dog dog1 = new Dog("Рекс");

        cat2.run(100);
        cat1.swim(100);
        dog1.swim(20);

        Cat[] cats = {new Cat("Барсик"), new Cat("Тимофей"), new Cat("Кот")};
        cat1.addendumFood(10);
        for (Cat cat : cats) {
            cat.eat(10);
        }

        System.out.println("Сытость котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.satiety ? "сыт" : "голоден"));
        }
    }
}


