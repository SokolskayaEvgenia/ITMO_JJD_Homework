package hw03;

import java.util.Scanner;

public class Task02 {

    /*
    Задача на while
    Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое положительное целое число: ");
        try{
            int userNumber = scanner.nextInt();
            int sum = 0;
            if (userNumber>0){
                while (userNumber>0){
                    int digit = userNumber%10;
                    sum += digit;
                    userNumber /= 10;
                }
                System.out.println(sum);
            }
            else System.out.println("Введите целое положительное число");
        }
        catch (Exception e){
            System.out.println("Введите целое положительное число");
        }





    }
}
