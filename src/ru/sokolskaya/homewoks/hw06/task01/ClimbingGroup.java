package ru.sokolskaya.homewoks.hw06.task01;

import java.util.Arrays;

public class ClimbingGroup {

    private int number;
    private Mountain mountain;
    private int quantity;
    private final Climber[] climbers;
    private boolean isRecruiting = true;

    public ClimbingGroup(int number, Mountain mountain, int quantity) {
        this.number = number;
        setMountain(mountain);
        setQuantity(quantity);
        climbers = new Climber[quantity];
    }

    public int getQuantity() {
        return quantity;
    }

    private void setQuantity(int quantity) {
        if (quantity < 2 || quantity > 15)
            throw new IllegalArgumentException("В группе восхождения должно быть от 2 до 15 человек");
        this.quantity = quantity;
    }

    public Climber[] getClimbers() {
        return climbers;
    }

    public Mountain getMountain() {
        return mountain;
    }

    private void setMountain(Mountain mountain) {
        if (mountain == null) throw new IllegalArgumentException("На эту гору не совершаем восхождения");
        this.mountain = mountain;
    }

    public boolean isRecruiting() {
        return isRecruiting;
    }



    public void setRecruiting(boolean recruiting) {
        isRecruiting = recruiting;
    }

    public void addClimber(Climber climber) {
        for (int i = 0; i < climbers.length; i++) {
            if (!isRecruiting()) {
                System.out.println("Набор в группу " + this.number + " закрыт");
                return;
            }
            if (climbers[i] == null) {
                climbers[i] = climber;
                if (i == climbers.length - 1) {
                    this.setRecruiting(false);
                    System.out.println("В группе " + this.number + " не осталось свободных мест");
                }
                return;
            }
        }
    }

    public void addClimber(Climber... climbers) {
        //System.out.println(Arrays.toString(climbers));
        for (Climber climber : climbers) addClimber(climber);
    }

    @Override
    public String toString() {
        return "ClimbingGroup{" +
                "number=" + number +
                ", mountain=" + mountain +
                ", quantity=" + quantity +
                ", climbers=" + Arrays.toString(climbers) +
                ", isRecruiting=" + isRecruiting +
                '}';
    }
}
