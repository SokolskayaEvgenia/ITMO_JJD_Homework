package hw04;

import java.util.Arrays;

public class Task01 {

    /* TODO: Заполните массив на N элементов случайным целыми числами и
        выведите максимальное, минимальное и среднее значение */

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10 + 1); // случайный массив длинной от 1 до 10
        int[] arr = new int[n];
        int sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 201 - 100); // случайные числа в диапазоне [-100;100]
            sum += arr[i];
            average += (double) sum / arr.length;
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
        System.out.println("Максимальное значение: " + arr[arr.length - 1]);
        System.out.println("Минимальное значение: " + arr[0]);
        System.out.printf("Среднее значение: %.2f", average);


    }


}
