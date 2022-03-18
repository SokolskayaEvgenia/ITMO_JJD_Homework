package ru.sokolskaya.homewoks.hw06.task01;

public class Mountain {

    private String name;
    private String country;
    private int height;

    public Mountain() {
    }

    public Mountain(String name) {
        setName(name);
    }

    public Mountain(String name, String country) {
        this(name);
        setCountry(country);
    }

    public Mountain(String name, String country, int height) {
        this(name, country);
        setHeight(height);
    }

    public void setName(String name) {
        if (name == null || name.length() < 4) {
            throw new IllegalArgumentException("Название горы не может быть менее 4 символов");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.length() < 4) {
            throw new IllegalArgumentException("Название страны нахождения горы не может быть менее 4 символов");
        }
        this.country = country;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 100) {
            throw new IllegalArgumentException("Высота горы не может быть менее 100 метров");
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", height=" + height +
                '}';
    }
}
