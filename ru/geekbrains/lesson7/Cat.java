package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public boolean isHungry() {
        return hungry;
    }

    public Cat(String name) {
        this.name = name;
        this.appetite = 5;
        this.hungry = false;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public int getAppetite() {
        return appetite;
    }

    public void info() {
        System.out.println(name + " " + hungry);
    }

    public void eat(Plate plate) {
        if(plate.getFood() <= 0 && appetite != 0||plate.getFood()<appetite) {
            hungry = false;
            System.out.println("Недостаточное количество еды в миске");
            return;
        }
        plate.decreaseFood(appetite);
        hungry = true;
        System.out.println("Кот поел из тарелки!");
    }
}
