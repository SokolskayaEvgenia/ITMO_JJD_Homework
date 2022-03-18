package ru.sokolskaya.homewoks.hw06;

import ru.sokolskaya.homewoks.hw06.task01.Climber;
import ru.sokolskaya.homewoks.hw06.task01.ClimbingGroup;
import ru.sokolskaya.homewoks.hw06.task01.Mountain;

public class Application {
    public static void main(String[] args) {
        Mountain mountain1 = new Mountain("Эверест");
        Mountain mountain2 = new Mountain("Пик Исмои́ла Сомони́","Таджикистан");
        Mountain mountain3 = new Mountain("Эльбрус", "Россия", 5642);

        mountain1.setCountry("Китай");
        mountain1.setHeight(8848);
        mountain2.setHeight(7495);

        Climber climber1 = new Climber("Иван");
        Climber climber2 = new Climber();
        Climber climber3 = new Climber("John", "Usa, Boston");
        climber2.setName("Илья");
        climber2.setAddress("Россия, Москва");
        climber1.setAddress("Россия, СПБ");

        ClimbingGroup group1 = new ClimbingGroup(mountain1);
        ClimbingGroup group2 = new ClimbingGroup(mountain2);
        ClimbingGroup group3 = new ClimbingGroup(mountain3);
        group1.setQuantity(10);
        group2.setQuantity(5);
        group3.setQuantity(2);
        group1.addClimber(climber1,climber2,climber3);
        group1.setRecruiting(false);
        group2.addClimber(climber1);
        group2.addClimber(climber2);
        group3.addClimber(climber2,climber3);

        System.out.println(mountain1.toString());
        System.out.println(mountain2.toString());
        System.out.println(mountain3.toString());
        System.out.println(climber1.toString());
        System.out.println(climber2.toString());
        System.out.println(climber3.toString());
        System.out.println(group1.toString());
        System.out.println(group2.toString());
        System.out.println(group3.toString());
    }






}
