package HW01;

//задача на тернарный оператор
public class Task01 {
    public static void main(String[] args) {
        double purchase = 10000, discount = 10;
        double sum = purchase > 100000 ? purchase-(purchase*discount/100) : purchase;
        System.out.println(sum);

    }
}
