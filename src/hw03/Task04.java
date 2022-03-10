package hw03;

import java.util.Scanner;

public class Task04 {

    /*
    Задача на цикл
    1. Пользователь загадывает число в диапазоне от [2 до 100]
    2. Программа пытается его угадать (используйте метод бинарного поиска - деление отрезка на 2).
    3. Программа может задавать пользователю вопросы: Число равно ...? / Число больше ...? / Число меньше ...? и в зависимоти от ответа пользователя принимать решения.
    4. Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
     */
    public static void main(String[] args) {
        System.out.println("Загадайте число от 2 до 100.");
        int start = 2, end = 100;
        int number = (end + start) / 2;
        System.out.println("Вы загадали " + number + "?");
        Scanner in = new Scanner(System.in);
        byte answer = in.nextByte();
        if (answer == 1) System.out.println("Вот это я молодец!");
        else {
            while (answer != 1) {
                System.out.println("Число больше?");
                answer = in.nextByte();
                if (answer == 1) start = number;
                else end = number;
                number = (end + start) / 2;
                System.out.println("Вы загадали " + number + "?");
                answer = in.nextByte();
            }
            System.out.println("Угадано!)))");
        }

    }
}

