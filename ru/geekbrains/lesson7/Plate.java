package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        if (food>=amount){
            food -= amount;
        }
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.printf("Plate [ Food: %d ]\n", food);
    }

    public void setFood(int food) {
        this.food += food;
    }
}
