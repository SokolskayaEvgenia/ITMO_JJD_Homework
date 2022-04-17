package ru.sokolskaya.homewoks.hw06.task03;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse(15);
        Mouse mouse2 = new Mouse(10);
        Mouse mouse3 = new Mouse(8);
        Mouse mouse4 = new Mouse(5);
        Mouse mouse5 = new Mouse(20);
        Mouse mouse6 = new Mouse(14);
        Mouse mouse7 = new Mouse(13);
        Mouse mouse8 = new Mouse(10);
        Mouse mouse9 = new Mouse(9);
        Mouse mouse10 = new Mouse(7);

        Cat cat1 = new Cat("Tom", 10, 5);
        Cat cat2 = new Cat("Max", 15, 6);
        Cat cat3 = new Cat("Fluffy", 20, 7);
        Cat cat4 = new Cat("Mick", 10, 5);

        cat1.catchMouse(mouse1, mouse2, mouse3, mouse4, mouse5, mouse6, mouse7, mouse8, mouse9, mouse10);
        System.out.println(Arrays.toString(cat1.getMice()));
        cat2.catchMouse(mouse4, mouse5, mouse6, mouse7);
        System.out.println(Arrays.toString(cat2.getMice()));
        cat3.catchMouse(mouse8,mouse9);
        System.out.println(Arrays.toString(cat3.getMice()));
        cat4.catchMouse(mouse10);
        System.out.println(Arrays.toString(cat4.getMice()));

        cat1.attackCat(cat2);
        System.out.println(Arrays.toString(cat2.getMice()));
        System.out.println(Arrays.toString(cat1.getMice()));


    }




}
