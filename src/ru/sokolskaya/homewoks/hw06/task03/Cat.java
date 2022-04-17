package ru.sokolskaya.homewoks.hw06.task03;

import java.util.Arrays;

public class Cat {

    private String name;
    private double speed;
    private double weight;
    private final Mouse[] mice = new Mouse[100];

    public Cat(String name, double speed, double weight) {
        setName(name);
        setSpeed(speed);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.length() < 3) throw new IllegalArgumentException("Имя кота должно быть более 3 символов");
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    private void setSpeed(double speed) {
        if (speed < 5) throw new IllegalArgumentException("Кот должен бегать");
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        if (weight < 5) throw new IllegalArgumentException("Вес кота должен быть не менее 5кг");
        this.weight = weight;
    }

    public Mouse[] getMice() {
        return mice;
    }

    public void catchMouse(Mouse mouse) {
        if (mouse == null) throw new IllegalArgumentException("Мышка не существует");
        for (int i = 0; i < mice.length; i++) {
            if (mouse.getSpeed() > this.getSpeed()) {
                System.out.println("Мышь убежала! Кот " + this.name + " лишь облизнулся");
                return;
            }
            if (mice[i] == null) {
                mice[i] = mouse;
                return;
            }
        }
        System.out.println("Коту нужно отдохнуть. Максимум 100 мышей");
    }

    public void catchMouse(Mouse... mice) {
        for (Mouse mouse : mice) {
            catchMouse(mouse);
        }
    }

    public void attackCat(Cat cat) {
        int count = 0;
        if (this == cat) throw new IllegalArgumentException("Нельзя напасть на себя!");
        if (this.getWeight() == cat.getWeight()) System.out.println("Равный бой. Все при своих мышах");
        else if (this.getWeight() > cat.getWeight()) {
            for (int i = 0; i < cat.mice.length; i++) {
                for (int j = 0; j < this.mice.length; j++) {
                    if (this.mice[j] == null && cat.mice[i] != null) {
                        this.catchMouse(cat.mice[i]);
                        count += 1;
                        cat.mice[i] = null;
                    }
                }
            }
            System.out.println("Кот " + this.name + " победил!  Поймано " + count + " мышей");
        } else {
            for (int i = 0; i < this.mice.length; i++) {
                for (int j = 0; j < cat.mice.length; j++) {
                    if (cat.mice[j] == null && this.mice[i] != null) {
                        cat.catchMouse(this.mice[i]);
                        count += 1;
                        this.mice[i] = null;
                    }
                }
            }
            System.out.println("Кот " + cat.name + " победил! Поймано " + count + " мышей");
        }
    }
}


