package ru.sokolskaya.homewoks.hw06.task01;

import java.util.Arrays;

public class ClimbingGroup {

    private Mountain mountain;
    private int quantity;
    private Climber[] climbers = new Climber[5];
    private boolean isRecruiting = true;

    public ClimbingGroup(){}

    public ClimbingGroup(Mountain mountain){
        setMountain(mountain);
    }

    public ClimbingGroup(Mountain mountain, int quantity){
        this(mountain);
        setQuantity(quantity);
    }

    public ClimbingGroup(Mountain mountain, int quantity, boolean  isRecruiting){
       this(mountain, quantity);
       setRecruiting(isRecruiting);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<2 || quantity>15) throw new IllegalArgumentException("В группе восхождения должно быть от 2 до 15 человек");
        this.quantity = quantity;
    }

    public Climber[] getClimbers(){
        return climbers;
    }

    public Mountain getMountain() {
        return mountain;
    }

    public void setMountain(Mountain mountain) {
        if (mountain == null) throw new IllegalArgumentException("На эту гору не совершаем восхождения");
        this.mountain = mountain;
    }

    public boolean isRecruiting() {
        return isRecruiting;
    }

    public void setRecruiting(boolean recruiting) {
        isRecruiting = recruiting;
    }

    public void addClimber(Climber climber){
        for (int i = 0; i < climbers.length; i++) {
            if (!isRecruiting()){
                System.out.println("Набор в группу закрыт");
                return;
            }
            if(climbers[i] == null){
                climbers[i] = climber;
                return;
            }

        }this.setRecruiting(false);
        System.out.println("В группе не осталось свободных мест");

    }

    public void addClimber(Climber... climbers){
        System.out.println(Arrays.toString(climbers));
        for (Climber climber : climbers) addClimber(climber);
    }

    @Override
    public String toString() {
        return "ClimbingGroup{" +
                "mountain=" + mountain +
                ", quantity=" + quantity +
                ", climbers=" + Arrays.toString(climbers) +
                ", isRecruiting=" + isRecruiting +
                '}';
    }
}
