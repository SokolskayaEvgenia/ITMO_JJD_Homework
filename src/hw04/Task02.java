package hw04;

import java.util.Arrays;

public class Task02 {
    /* TODO: Создайте массив из чётных чисел [2;20] и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2) */

    public static void main(String[] args) {
        int[] evens = new int[20 / 2];
        for (int i = 0, el = 2; i < evens.length; i++, el += 2) {
            evens[i] = el;
        }
        System.out.println(Arrays.toString(evens));
        for (int i = evens.length - 1; i >= 0; i--) {
            System.out.print(evens[i] + " ");
        }

    }
}
