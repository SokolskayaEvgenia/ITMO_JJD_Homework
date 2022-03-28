package ru.sokolskaya.homewoks.hw06.task02;

import java.util.Arrays;

public class MyProducts {

    private double maxProteins;
    private double maxFats;
    private double maxCarbohydrates;
    private double maxCalories;
    private Product[] products;

    public MyProducts(int quantity, double maxProteins, double maxFats, double maxCarbohydrates, double maxCalories) {
        products = new Product[quantity];
        setMaxProteins(maxProteins);
        setMaxFats(maxFats);
        setMaxCarbohydrates(maxCarbohydrates);
        setMaxCalories(maxCalories);
    }

    public double getMaxProteins() {
        return maxProteins;
    }

    private void setMaxProteins(double maxProteins) {
        if (maxProteins < 0) throw new IllegalArgumentException("Кол-во белков не может быть отрицательным");
        this.maxProteins = maxProteins;
    }

    public double getMaxFats() {
        return maxFats;
    }

    private void setMaxFats(double maxFats) {
        if (maxFats < 0) throw new IllegalArgumentException("Кол-во жиров не может быть отрицательным");
        this.maxFats = maxFats;
    }

    public double getMaxCarbohydrates() {
        return maxCarbohydrates;
    }

    private void setMaxCarbohydrates(double maxCarbohydrates) {
        if (maxCarbohydrates < 0) throw new IllegalArgumentException("Кол-во углеводов не может быть отрицательным");
        this.maxCarbohydrates = maxCarbohydrates;
    }

    public double getMaxCalories() {
        return maxCalories;
    }

    private void setMaxCalories(double maxCalories) {
        if (maxCalories < 0) throw new IllegalArgumentException("Кол-во калорий не может быть отрицательным");
        this.maxCalories = maxCalories;
    }

    public void addProduct(Product product) {
        if (product == null) throw new IllegalArgumentException("Такого продукта нет");
        for (int i = 0; i < products.length; i++) {
            if (product.getProteins() <= maxProteins && product.getFats() <= maxFats && product.getCarbohydrates() <= maxCarbohydrates && product.getCalories() <= maxCalories) {
                if (products[i] == null) {
                    products[i] = product;
                    System.out.println("Продукт \"" + product.getName() + "\" добавлен в разрешенный список");
                    return;
                }
            } else {
                System.out.println("Продукт \"" + product.getName() + "\" не добавлен в разрешенный список");
                if (product.getProteins() > maxProteins) {
                    System.out.println("Превышение по содержанию белков");
                }
                if (product.getFats() > maxFats) {
                    System.out.println("Превышение по содержанию жиров");
                }
                if (product.getCarbohydrates() > maxCarbohydrates) {
                    System.out.println("Превышение по содержанию углеводов");
                }
                if (product.getCalories() > maxCalories) {
                    System.out.println("Превышение по калориям");
                }
                return;
            }
        }
        System.out.println("Добавлено максимальное кол-во продуктов в разрешенный список");
    }
    
    public void addProduct(Product... products){
        for (Product product : products) {addProduct(product); }
    }

    public void printMyProducts(){
        System.out.println("В разрешенном списке: ");
        for (Product product : products) {
            if (product!=null) System.out.println(product.getName());
        }
    }


}
