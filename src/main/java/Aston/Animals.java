package Aston;

public class Animals {
    String name;
    int food;
    int distanceRun;
    int distanceSwim;
    int countAnimal;
    int quantityAnimals = 0;

    public Animals(String name, int food) {
        this.name=name;
        this.food=food;
    }

    public void run(int distanceRun) {
        System.out.println("Животное пробежало " + distanceRun + "метров");
    }
    public void swim(int distanceSwim) {
        System.out.println("Животное проплыло " + distanceSwim + "метров");
    }
    public void Animal(){
        countAnimal++;
    }
    public Animals(String name){
        this.name = name;
        quantityAnimals++;
    }

}
