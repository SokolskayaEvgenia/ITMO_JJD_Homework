package ru.sokolskaya.homewoks.hw06.task03;

public class Mouse {

    private double speed;

    public Mouse(double speed){
        setSpeed(speed);
    }

    public double getSpeed() {
        return speed;
    }

    private void setSpeed(double speed) {
        if (speed <5) throw new IllegalArgumentException("Мышь должна бегать");
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "speed=" + speed +
                '}';
    }
}
