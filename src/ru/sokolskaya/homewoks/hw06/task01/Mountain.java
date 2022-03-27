package ru.sokolskaya.homewoks.hw06.task01;

public class Mountain {

    private String name;
    private String country;
    private int height;

    public Mountain(String name, String country) {
        setName(name);
        setCountry(country);
    }

    public Mountain(String name, String country, int height) {
        this(name, country);
        setHeight(height);
    }

    private void setName(String name) {
        if (name == null || name.length() < 4) {
            throw new IllegalArgumentException("Название горы не может быть менее 4 символов");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setCountry(String country) {
        if (country == null || country.length() < 4) {
            throw new IllegalArgumentException("Название страны нахождения горы не может быть менее 4 символов");
        }
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    // метод setHeight с модификатором доступа public, т.к. альпинист может покорить новую высоту
    public void setHeight(int height) {
        if (height < 100) {
            throw new IllegalArgumentException("Высота горы не может быть менее 100 метров");
        }
        this.height = height;
    }

    public int getHeight() {
        return height;
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
