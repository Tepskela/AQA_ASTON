package Aston;

public class Cat extends Animals {
    boolean satiety = false;
    public Cat(String name, int food){
        super(name,food);
    }
    int quantityCats;

    @Override
    public void run(int distanceRun) {
        if (distanceRun < 200) {
            System.out.println(name + " пробежал " + distanceRun + " метров");
        } else {
            System.out.println(name + " пробежал 200 метров и устал");
        }
    }

    @Override
    public void swim(int distanceSwim) {
        System.out.println("Кот " + name + " не умеет плавать");
    }

    public void addendumFood(int amount) {
        if (amount <= 0) {
            System.out.println("Нельзя добавить нулевое или отрицательное количество еды");
        }
        food += amount;
        System.out.println("Добавлено " + amount + " еды в миску");
        System.out.println("В миске стало" + food + " еды");
        return;
    }

    public void eat(int amount) {
        if (amount <= 0) {
            System.out.println("Нельзя съесть отрицательное или нулевое колличество еды " + satiety);
            return;
        } else if (food - amount <=0) {
            System.out.println("В миске нет столько еды " + satiety);
        } else {
            satiety = true;
            System.out.println("Кот " + name + " съел " + amount + " еды" + satiety);
            food -= amount;
        }
    }
    public Cat (String name){
        super(name);
        quantityCats++;
    }
}

