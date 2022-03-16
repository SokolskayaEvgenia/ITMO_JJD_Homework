package hw05;

import java.util.Arrays;

public class Task03 {
    /* TODO: Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
        Предложение для поска длинного слова: "в предложении все слова разной длины".
        Converts this string to a new character array.*/

    public static void main(String[] args) {
        String sentence = "Converts this string to a new character array";
        String[] words = sentence.split(" ");
        int length, max=0, index=0;
        int[] letterQuantity = new int[words.length];
        for (int i=0; i< words.length; i++) {
            length = words[i].length();
            letterQuantity[i] = length;
        }
        for (int i = 0; i < letterQuantity.length-1; i++) {
            if(letterQuantity[i]>max) {
                max=letterQuantity[i];
                index=i;
            }
        }
        System.out.println(words[index]);

    }
}
