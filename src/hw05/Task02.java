package hw05;

import java.util.Locale;
import java.util.Scanner;

public class Task02 {
    /* TODO: Заменить все буквы в слове на строчные, а первую букву на заглавную.
        Например, дано hello, получаем Hello / дано HeLLO, получаем Hello. */

    public static void main(String[] args) {
        System.out.println("Введите слово");
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();
        String firstLetter = Character.toString(userWord.charAt(0)).toUpperCase();
        String word = firstLetter.concat(userWord.substring(1).toLowerCase());
        System.out.println(word);


    }
}
