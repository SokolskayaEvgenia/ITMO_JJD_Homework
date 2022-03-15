package hw04;

import java.util.Arrays;

public class Task04 {

    /* TODO: Задан одномерный массив целых чисел.
        Образуйте из него два отсортированных по возрастанию массива, содержащих четные и нечетные числа.*/

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10 + 1); // случайный массив длинной от 1 до 10
        int[] arr = new int[n];
        int evenElems = 0, oddElems = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 201 - 100); // случайные числа в диапазоне [-100;100]
            if (arr[i]%2==0) evenElems+=1;
            else oddElems+=1;
        }
        System.out.println("Исходный массив: "+ Arrays.toString(arr));
        int[] evens = new int[evenElems];
        int[] odds = new int[oddElems];
        int j=0, k =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                evens[j] = arr[i];
                j++;
            }
            else {
                odds[k] = arr[i];
                k++;
            }
        }
        System.out.println("Массив четных чисел: "+Arrays.toString(evens));
        System.out.println("Массив нечетных чисел: "+Arrays.toString(odds));
        Arrays.sort(evens);
        Arrays.sort(odds);
        System.out.println("Отсортированный массив четных чисел: "+Arrays.toString(evens));
        System.out.println("Отсортированный массив нечетных чисел: "+Arrays.toString(odds));
    }
}
