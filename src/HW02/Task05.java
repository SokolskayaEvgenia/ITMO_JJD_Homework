package HW02;

public class Task05 {

    /*
    Задача по решению на уроке
    Сократить условия в блоках if;

    int month = 5;
    if (month > 0 && month < 3 || month == 12) {
        System.out.println("Зима");
    } else if (month > 2 && month < 6) {
        System.out.println("Весна");
    } else if (month > 5 && month < 9){
        System.out.println("Лето");
    } else if (month > 8 && month < 11) {
        System.out.println("Осень");
    } else {
        System.out.println("Ошибка");
    }
     */

    public static void main(String[] args) {
        int month = 12;
        if (month >= 1 && month <= 12) {
            if (month < 3 || month > 11) System.out.println("Зима");
            else if (month > 8) System.out.println("Осень");
            else if (month > 5) System.out.println("Лето");
            else System.out.println("Весна");
        } else System.out.println("Ошибка ввода данных");

        //если сократить условия во всех блоках if(кроме проверки правильности ввода)
        // строк получается больше

       /* if (month >= 1 && month <= 12) {
            if (month > 11) System.out.println("Зима");
            else if (month > 8) System.out.println("Осень");
            else if (month > 5) System.out.println("Лето");
            else if (month > 2) System.out.println("Весна");
            else System.out.println("Зима");
        } else System.out.println("Ошибка ввода данных");*/
    }
}
