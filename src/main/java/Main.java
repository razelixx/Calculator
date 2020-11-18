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
*/

public class Main {
    public static void main(String[] args) throws Exception {
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
                System.out.printf("Сумма сложения %f и %f равна %.4f", firstNum, secondNum, result);
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
    }
}
//решил использовать здесь комментарий