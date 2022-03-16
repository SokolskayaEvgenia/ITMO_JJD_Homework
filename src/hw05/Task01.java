package hw05;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    /* TODO: Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()),
        и добавлять их в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
        В итоге в массиве будут только уникальные слова.
        Выход их программы по слову exit (слово 'exit' в массив не добавлять) или если массив заполнен
        Перед завершением программы, вывести получившийся массив в консоль*/

    public static void main(String[] args) {
        System.out.println("Введите слово");
        int num = 5, i = 0;
        String[] words = new String[num];
        Scanner scanner = new Scanner(System.in);
        String word;
        while (i<num){
            word = scanner.nextLine();
            if (word.equalsIgnoreCase("exit")) break;
            if (Arrays.asList(words).contains(word)) continue;
            else {
                words[i] = word;
                i++;
            }
        }
        System.out.println(Arrays.toString(words));
    }
}
