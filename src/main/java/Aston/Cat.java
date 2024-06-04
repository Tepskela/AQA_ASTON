package Aston;

public class Cat extends Animals {
    boolean satiety = false;
    int food;
    int amountFoodDish;

    public Cat(String name) {
        super(name);
    }

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

    public void addendumFood(int amountFoodDish) {
        if (amountFoodDish <= 0) {
            System.out.println("Нельзя добавить нулевое или отрицательное количество еды");
        }
        food += amountFoodDish;
        System.out.println("Добавлено " + amountFoodDish + " еды в миску");
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
}

