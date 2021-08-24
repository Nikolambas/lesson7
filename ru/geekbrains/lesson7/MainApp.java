package ru.geekbrains.lesson7;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Cat [] cats = {
                new Cat("Барсик"),
                new Cat("Белка"),
                new Cat("Стрелка")
        };
        Plate plate = new Plate(12);
        for (Cat cat:cats) {
            cat.eat(plate);
            System.out.println(plate.getFood());
            System.out.println(cat.isHungry());
        }
    }
}
