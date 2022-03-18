package ru.sokolskaya.homewoks.hw06.task01;

public class Climber {

    private String name;
    private String address;

    public Climber() {
    }

    public Climber(String name) {
        setName(name);
    }

    public Climber(String name, String address) {
        this(name);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3)
            throw new IllegalArgumentException("Имя альпиниста не может быть менее 3 символов");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.length() < 5)
            throw new IllegalArgumentException("Адрес проживания альпиниста не может быть менее 5 символов");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
