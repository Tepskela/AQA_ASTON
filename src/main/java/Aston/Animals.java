package Aston;

public class Animals {
    String name;
    int distanceRun;
    int distanceSwim;
    int countAnimal;

    public Animals(String name) {
        this.name=name;
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

}
