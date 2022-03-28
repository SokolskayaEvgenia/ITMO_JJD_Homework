package ru.sokolskaya.homewoks.hw06.task02;

public class Product {

    private String name;
    private double proteins;
    private double fats;
    private  double carbohydrates;
    private  double calories;

    public Product(String name){
        setName(name);
    }

    public Product(String name, double proteins, double fats){
        this(name);
        setProteins(proteins);
        setFats(fats);
    }

    public Product (String name, double proteins, double fats, double carbohydrates){
        this(name, proteins,fats);
        setCarbohydrates(carbohydrates);
    }

    public Product (String name, double proteins, double fats, double carbohydrates, double calories){
        this(name, proteins, fats, carbohydrates);
        setCalories(calories);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name==null || name.length()<3) {
            throw new IllegalArgumentException("Название продукта должно быть " +
                    "не менее 3 символов");
        }
        this.name = name;
    }

    public double getProteins() {
        return proteins;
    }

    private void setProteins(double proteins) {
        if(proteins<0) throw new IllegalArgumentException("Кол-во белков не может быть отрицательным");
        this.proteins = proteins;
    }

    public double getFats() {
        return fats;
    }

    private void setFats(double fats) {
        if(fats<0) throw new IllegalArgumentException("Кол-во жиров не может быть отрицательным");
        this.fats = fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    private void setCarbohydrates(double carbohydrates) {
        if(carbohydrates<0) throw new IllegalArgumentException("Кол-во углеводов не может быть отрицательным");
        this.carbohydrates = carbohydrates;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        if(calories<0) throw new IllegalArgumentException("Кол-во калорий не может быть отрицательным");
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", proteins=" + proteins +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", calories=" + calories +
                '}';
    }
}
