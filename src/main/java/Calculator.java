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
         * @param main.a \
         * @param main.b  } Три переменные для остановки цикла while (что-то не смог с первого раза с ключевыми словами, разбираться лень, забил)
         * @param main.c /
         * @param main.strings - массив строк
         * @param main.length - длинна масисва строк main.strings, вводимая с клавиатуры
         * @param max - вычисляемый в цикле элемент массивы с максимальной длинной
         * @see #main
         */
        //переменная-выключатель для цикла while
        int b = 1;
        while (b == 1) {
            System.out.println("Выберите режим работы. Введите 1 для калькулятора, 2 для поиска длиннейшего элемента в массиве строк, выберите 3 для того, чтобы выйти: ");
            //Создадим объект Scanner для ввода данных в консоль
            Scanner scanner = new Scanner(System.in);
            //Строка со всеми возможными вариантами операций для калькулятора
            String operations = "+-*/";
            //Считываем число для выбора режима работы: 1 для калькулятора, 2 для поиска максимального эелемента в массиве

            int make_choise = scanner.nextInt();
            //Если выбрали 1 - то запускается калькулятор:
            if (make_choise == 1) {
                //переменная выключатель для цикла while
                int c = 1;
                while (c == 1) {
                    System.out.print("Выберите операцию: (введите + для сложения, - для вычитания, * для умножения, / для деления) ");
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
                    //В конце проверка на выход.
                    if (exit.equals("Да")) {
                        //Обнуляем переменную чтобы выйти из цикла while
                        c = 0;
                    }
                }
            }
            //Если выбрали 2 - запускается поиск самого длинного слова в массиве:
            else if (make_choise == 2) {
                //Переменная-выключатель для цикла while
                int a = 1;
                while (a == 1) {
                    //Просим ввести длинну массива...
                    System.out.println("Введите длинну массива: ");
                    //...присваиваем ее переменной length
                    int length = scanner.nextInt();
                    //создаем пустой массив строк длинной length
                    String[] strings = new String[length];
                    //в цикле заполняем его вводимыми с клавиатуры словами
                    for (int i = 0; i < length; i++) {
                        System.out.print("Введите " + i + "-й элемент массива: ");
                        strings[i] = scanner.next();
                    }
                    //Присваиваем переменной max значение нулевого элемента массива
                    String max = strings[0];
                    //Обходим массив в цикле foreach, првоеряем: если следующий элемент длиннее, чем  max...
                    for (String s : strings) {
                        if (s.length() > max.length()) {
                            //... то его значение и присваиваем в переменную max!:) *magic!*
                            max = s;
                        }
                    }
                    System.out.println("Самый длинный элемент массива это: " + max);
                    System.out.println("\nВыйти? (наберите Да для выхода и что угодно для продолжения): ");
                    String exit = scanner.next();
                    //В конце проверка на выход
                    if (exit.equals("Да")) {
                        //обнуляем переменную чтобы выйти из цикла while
                        a = 0;
                    }
                }
            }
            //Если выбрали 3 - то все, выход
            else if (make_choise == 3) {
                //Обнуляем переменную чтобы выйти из цикла while
                b = 0;
            }
        }
    }
}
/* Наверняка это все можно реализовать гораздо проще, чем таким выелосипедом, но мне лень, я устал на работе,
а этот кусок кода все равно работает :)
 */