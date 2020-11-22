import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author maksimarhipov
 */

/*
Задание №2
1. Начинаем писать калькулятор:
Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
Использовать комментарии и JavaDoc при описании метода. Использовать форматирование при выводе результата в консоль.
Полученный результат округлять до 4-х знаков после запятой.
2. Запушить проект в свой репозиторий на GitHub
*Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)

Задание №3
1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания
2. Поиск максимального элемента в массиве. Для начала задать массив слов.Размерность массива произвольна, задается в консоли.
После чего в консоли вводятся слова в количестве равном заданной длине массива.
В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
3. Программа должна выполнять одно из заданий на выбор. Если в консоли ввести 1 - запуститься выполнение калькулятора,
если 2 - поиск максимального слова в массиве.
*/

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Для перехода к калькулятору введите 1, для перехода к массиву - 2");
        Scanner scanEx = new Scanner(System.in);
        int ex = scanEx.nextInt();
        if (ex == 1) {
            System.out.println("Введите первое число: ");
            Scanner scanner = new Scanner(System.in);
            double firstNum = scanner.nextDouble();
            System.out.println("Введите второе число: ");
            double secondNum = scanner.nextDouble();
            double result;
            System.out.println("Введите операцию: +, -, * или /");
            char operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    result = firstNum + secondNum;
                    System.out.printf("%.4f", result);
                    break;
                case '-':
                    result = firstNum - secondNum;
                    System.out.printf("%.4f", result);
                    break;
                case '*':
                    result = firstNum * secondNum;
                    System.out.printf("%.4f", result);
                    break;
                case '/':
                    result = firstNum / secondNum;
                    System.out.printf("%.4f", result);
                    break;
                default:
                    System.out.println("Операция не распознана.");
            }
        } else if (ex == 2) {
            System.out.println("Введите количество строк в массиве:");
            Scanner scan = new Scanner(System.in);
            int stringCount = scan.nextInt();
            List<String> stringArray = new ArrayList<String>();
            System.out.println("Введите " + stringCount + " строк для массива:");
            for (int i = 0; i < stringCount + 1; i++) {
                stringArray.add(scan.nextLine());
            }
            String largestWord = new String();
            for (int i = 0; i < stringCount + 1; i++) {
                if (largestWord.length() < stringArray.get(i).length()) {
                    largestWord = stringArray.get(i);
                }
            }
            System.out.println(largestWord);
        } else
            System.out.println("Введено некорректное значение!");
    }
}