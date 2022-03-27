package ru.sokolskaya.homewoks.hw06.task01;

import ru.sokolskaya.homewoks.hw06.task01.Climber;
import ru.sokolskaya.homewoks.hw06.task01.ClimbingGroup;
import ru.sokolskaya.homewoks.hw06.task01.Mountain;

public class Application {
    public static void main(String[] args) {

        Climber climber1 = new Climber("Иван Петров", "Россия, СПБ");
        Climber climber2 = new Climber("Peter Johnson", "USA, NY");
        Climber climber3 = new Climber("Michael Schwarz", "Germany, Munich");

        Mountain mountain1 = new Mountain("Пик Исмои́ла Сомони́", "Таджикистан", 7495);
        Mountain mountain2 = new Mountain("Эверест", "Непал", 8848);
        Mountain mountain3 = new Mountain("Эльбрус", "Россия");
        mountain3.setHeight(5642);

        ClimbingGroup group1 = new ClimbingGroup(1, mountain1, 3);
        ClimbingGroup group2 = new ClimbingGroup(2, mountain2, 6);
        ClimbingGroup group3 = new ClimbingGroup(3, mountain3, 10);

        group1.addClimber(climber1, climber2, climber3);
        group2.addClimber(climber1, climber2);
        group2.setRecruiting(false);
        group3.addClimber(climber2);
        group3.addClimber(climber3);

        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);


    }


}
