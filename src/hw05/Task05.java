package hw05;

import java.util.Scanner;

public class Task05 {
    /* TODO: Определить, является ли строка палиндромом.
        Палиндром — это число, буквосочетание, слово или текст, которые одинаково читаются по буквам или по словам как слева направо,
        так и справа налево. Например, 202 - палиндром / fafaf - палиндром / а роза упала на лапу Азора - палиндром*/

    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        String string = userString.replaceAll(" ","");
        StringBuilder sb = new StringBuilder(string).reverse();
        if (string.equalsIgnoreCase(sb.toString()))
            System.out.println("Строка \"" + userString + "\" является палиндромом");
        else System.out.println("Строка \"" + userString + "\" не является палиндромом");
    }
}
