package Aston;

import java.util.Stack;

public class Dog extends Animals {
    public Dog(String name, int food) {
        super(name, food);
    }
    int quantityDogs;

    @Override
    public void run(int distanceRun) {
        if (distanceRun < 500) {
            System.out.print("Собака" + name + " пробежала " + distanceRun + " метров");
        } else {
            System.out.println("Собака" + name + " пробежала 500 метров и устала");
        }
    }
    @Override
    public void swim (int distanceSwim){
        if (distanceSwim < 10) {
            System.out.println("Собака" + name +" проплыла " + distanceSwim + " метров");
        } else {
            System.out.println("Собака" + name + " проплыла 10 метров и устала");
        }
    }
    public Dog (String name){
        super(name);
        quantityDogs++;
    }
}
