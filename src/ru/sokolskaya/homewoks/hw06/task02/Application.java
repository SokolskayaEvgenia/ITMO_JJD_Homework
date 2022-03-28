package ru.sokolskaya.homewoks.hw06.task02;

public class Application {
    public static void main(String[] args) {
        Product apricot = new Product("Абрикос", 0.9,0,10.5);
        apricot.setCalories(45);
        Product tea = new Product("Черный чай без сахара");
        Product beef =new Product("Говядина", 18.9,12.4,0,187);
        Product chocolate = new Product("Шоколад молочный", 6.9,35.7, 52.4,558 );

        System.out.println(apricot);
        System.out.println(tea);
        System.out.println(beef);
        System.out.println(chocolate);

        MyProducts myList = new MyProducts(3,10,20,55,600);
        myList.addProduct(apricot, tea, beef, chocolate);
        /*myList.addProduct(tea);
        myList.addProduct(beef);
        myList.addProduct(chocolate);*/
        myList.printMyProducts();
    }
}
