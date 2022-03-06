package HW02;

public class Task02 {

    /*
    Задача на switch
    Пользователь вводит 3 числа:
    1. первый операнд
    2. второй операнд
    3. оператор
    В зависимости от третьего введенного числа нужно вывести в консоль: сумму, разность, умножение, деления чисел, которые ввел пользователь.
    Если третье введенное число:
    3 - нужно найти сумму,
    5 - разность,
    7 - результат умножения,
    9 - результат деления.
     */

    public static void main(String[] args) {
        double firstNumber = -5, secondNumber = 0;
        double result;
        int op = 9;
        switch (op) {
            case 3:
                result = firstNumber + secondNumber;
                System.out.println("Сумма равна: " + result);
                break;
            case 5:
                result = firstNumber - secondNumber;
                System.out.println("Разность равна: " + result);
                break;
            case 7:
                result = firstNumber * secondNumber;
                System.out.println("Произведение равно: " + result);
                break;
            case 9:
                result = firstNumber / secondNumber;
                System.out.println("Частное равно: " + result);
                break;
        }

    }
}
