package hw03;

import java.util.Scanner;

public class Task03 {

    /*
    Задача на цикл
    1. Программа загадывает число в диапазоне [1;9]
    2. Пользователь вводит число с клавиатуры
    3. Программа в зависимости от введенного числа выводит в консоль следующее:
        "загаданное число больше"
        "загаданное число меньше"
        "Вы угадали" (программа завершает работу)
    4. Если введен 0, вывести "выход из программы" (программа завершает работу)
     */

    public static void main(String[] args) {
        game();
    }

    private static void game() {
        System.out.println("Загадано целое число от 1 до 9.");
        int number = (int) (Math.random() * 9 + 1);
        System.out.println("Угадайте число или введите 0 для выхода: ");
        Scanner scanner = new Scanner(System.in);
        try {
            out:
            {
                for (int userNumber = scanner.nextInt(); userNumber != number; System.out.println("Угадайте или число введите 0 для выхода: "), userNumber = scanner.nextInt()) {
                    if (userNumber < 0 || userNumber > 9) {
                        System.out.println("Введите число из диапазона");
                        continue;
                    }
                    if (userNumber == 0) break out;
                    else if (userNumber > number) System.out.println("Загаданное число меньше");
                    else System.out.println("Загаданное число больше");
                }
                System.out.println("Вы угадали!");
            }
            System.out.println("Выход из программы");

        } catch (Exception e) {
            System.out.println("Вы не ввели целое число из диапазона!");
            game();
        }
    }
}



