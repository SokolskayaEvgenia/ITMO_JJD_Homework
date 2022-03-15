package hw04;

import java.util.Arrays;

public class Task05 {
    /* TODO: Задать массив. Отрицательные элементы массива перенести в новый массив.
        Размер массива должен быть равен количеству отрицательных элементов. */

    public static void main(String[] args) {
        int n = (int) (Math.random() * 9 + 2); // случайный массив длинной от 2 до 10
        int[] arr = new int[n];
        int negElems = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 201 - 100); // случайные числа в диапазоне [-100;100]
            if (arr[i] < 0) negElems += 1;
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        int[] negatives = new int[negElems];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <0) {
                negatives[j] = arr[i];
                j++;
            }
        }
        System.out.println("Массив отрицательных чисел: " + Arrays.toString(negatives));
    }
}
