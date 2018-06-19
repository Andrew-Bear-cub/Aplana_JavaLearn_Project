import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /**
         * @author A.G. Makarov on 19/06/2018
         * Постарался запихнуть всю логику в метод main
         * Объявляем следующие переменные: operations, operation, firstNumber, secondNumber, result
         * @param main.operations - строка всех возможных математических операций
         * @param main.operation - выбранная математическая операция, производимуя над двумя числами
         * @param main.firstNumber - это первое вводимое число
         * @param main.secondNumber - это второе вводимое число
         * @param main.result - это результат выполненной математической операции
         * @see #main
         */
        String operations = "+-*/";
        //Цикл while будет повторяться пока мы из него не выйдем инструкцией break
        while (true) {
            System.out.print("Выберите операцию: (введите + для сложения, - для вычитания, * для умножения, / для деления) ");
            //Создадим объект Scanner для ввода данных в консоль
            Scanner scanner = new Scanner(System.in);
            //Вводим знак операции, которую хотели бы совершить
            String operation = scanner.next();
            //Проверяем вхождение набранного символа в стрку разрешенных, если нет - просим ввести еще раз
            if (!(operations.contains(operation))) {
                System.out.println("Данная операция не поддерживается! выберите другую!");
                continue;
            }
            //Вводим первое число
            System.out.print("Введите первое число: ");
            float firstNumber = scanner.nextFloat();
            //Вводим второе число
            System.out.print("Введите второе число: ");
            float secondNumber = scanner.nextFloat();
            //т.к. запихнул все в один метод, то различные операции реализовал через цикл if-else if-else
            if (operation.equals("+")) {
                float result = firstNumber + secondNumber;
                System.out.printf("Результат выполнения операции: %.4f", result);
            } else if (operation.equals("-")) {
                float result = firstNumber - secondNumber;
                System.out.printf("Результат выполнения операции: %.4f", result);
            } else if (operation.equals("*")) {
                float result = firstNumber * secondNumber;
                System.out.printf("Результат выполнения операции: %.4f", result);
            } else if (operation.equals("/")) {
                float result = firstNumber / secondNumber;
                System.out.printf("Результат выполнения операции: %.4f", result);
            }
            System.out.print("\nВыйти? (наберите Да для выхода и что угодно для продолжения): ");
            String exit = scanner.next();
            if (exit.equals("Да")) {
                break;
            //В конце проверка на выход.
            }
        }
    }
}
/* Наверняка это все можно реализовать гораздо проще, чем таким выелосипедом, но мне лень, я устал на работе,
а этот кусок кода все равно работает :)
 */