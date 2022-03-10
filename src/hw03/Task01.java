package hw03;

public class Task01 {

    /*
    Задача на for
    Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
     */

    public static void main(String[] args) {
        for (int num = 1, i=0; i<55; i++, num+=2){
            System.out.print(num+" ");
        }
    }
}
