import java.util.Scanner;
/**
 * @author A.G. Makarov on 19/06/2018
 * Без заморочек. Вводим числа и операцию в консоль, а он расчитывает результат.
 * Обрабатывает ошибку при делении на ноль.
 */
class OOP_Calc {

    private int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    //Тут дабл, потому что при делении может получится дробное число :)
    private double div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    //Переменная для хранения результата
    private double res = 0;


    public static void main(String[] args) {
        OOP_Calc calc = new OOP_Calc();
        Scanner scanner = new Scanner(System.in);

        //Вводим первое число
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        //Вводим второе число
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        //Вводим операцию
        System.out.print("Выберите операцию: ");
        char operation = scanner.next().charAt(0);
        //Вызов различных операций через case
        switch (operation) {
            case '+':
                calc.res = calc.sum(firstNumber, secondNumber);
                System.out.println("Результат: " + calc.res);
                break;
            case '-':
                calc.res = calc.sub(firstNumber, secondNumber);
                System.out.println("Результат: " + calc.res);
                break;
            case '*':
                calc.res = calc.mult(firstNumber, secondNumber);
                System.out.println("Результат: " + calc.res);
                break;
            case '/':
                try {
                    calc.res = calc.div(firstNumber, secondNumber);
                }
                catch (ArithmeticException ae){
                    System.out.println("На ноль делить нельзя! программа будет завершена");
                }
                break;
            default:
                System.out.println("Операция не распознана. Попробуйте еще раз.");
        }
    }
}


