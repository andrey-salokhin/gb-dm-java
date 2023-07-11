package lesson1_hw;
/**
 * Lesson 1 homework
 * 
 * Задание
 *
 * 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 * 2) Вывести все простые числа от 1 до 1000
 * 3) Реализовать простой калькулятор
 * 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
 */
import java.util.ArrayList;

public class Lesson_1 {

    public static void main(String[] args) {
        System.out.println(getSumOfNumbers(3));
        System.out.println(factorial(5));
        showIntList(getPrimeNumbers(101));
        System.out.println();
        System.out.println(calc(2, 6, '*'));
    }

    public static Integer getSumOfNumbers(Integer number) {
        Integer sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static Integer factorial(Integer number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static ArrayList<Integer> getPrimeNumbers(Integer num) {
        
        ArrayList<Integer> result = new ArrayList<Integer>(0);
    
        for (int i = 2; i <= num; i++) {
            if(isPrimeNumber(i)) {
                result.add(i);
            }
        }

        return result;

    }

    public static Boolean isPrimeNumber(Integer number) {
        Integer divider = 2;
        while (divider * divider <= number && number % divider != 0) {
            divider++;
        }
        return divider * divider > number;
    }

    public static void showIntList(ArrayList<Integer> array) {
        for (Integer number : array) {
            System.out.print(number + " ");
        }
    }

    public static Integer calc(Integer num1, Integer num2, Character action) {
        switch (action) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return 0;
        }
    } 

}