package hw04;

import java.util.Arrays;

public class Task03 {
    /* TODO: Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив в консоль.
        Определите какой элемент встречается в массиве чаще всего и выведите информацию об этом в консоль.
        Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.*/

    public static void main(String[] args) {
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 3) - 1;
        }
        System.out.println(Arrays.toString(array));
        int nullCount=0, negCount = 0, posCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) nullCount+=1;
            else if (array[i] == -1) negCount+=1;
            else posCount+=1;
        }
        if(nullCount> negCount && nullCount>posCount) System.out.println("Самый частый элемент массива: 0");
        else if (negCount> nullCount && negCount>posCount) System.out.println("Самый частый элемент массива: -1");
        else if (posCount>nullCount && posCount>negCount) System.out.println("Самый частый элемент массива: 1");
    }
}
