import java.util.Arrays;

/**
 * java.util.Random;
 *
 * @author A.G. Makarov on 19/06/2018
 * Импортировал Random чтобы массив при создании заполнялся сам, а не с клавиатуры и написал метод который меняет
 * местами мксимальный и минимальный элементы массива
 */
public class Array_Mix {

    public static void main(String[] args) {

        //Объявляем массив целых чисел величиной = 20
        int[] numbers = new int[20];
        //Дальше в цикле обходим массив, наполняя его случайными целыми числами от -10 до 10
        for (int i = 0; i < 20; i++) {
            //Дошел с трудом,но похоже чтобы вывести строго от нижнего до верхнего предела, нужно рандом умножить на
            //общее число значений между границами включая ноль (в нашем случае: от 10 до 10 ровно 21 число с нулем) и
            //прибавить минимальное. У нас вычитание, т.к. нижняя граница отрицательная!
            numbers[i] = (int) (Math.random() * 21) - 10;
        }
        System.out.println("Первый массив: " + Arrays.toString(numbers));
        //Вычисляем минимальный и максимальный элементы массива и ихиндексы, чтобы потом провести по индексам замену
        int max = numbers[0];
        int imax = 0;
        int min = numbers[0];
        int imin = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                imax = i;
            }
            else if (numbers[i] < min) {
                min = numbers[i];
                imin = i;
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("индекс максимального элемента: " + imax);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("индекс минимального элемента: " + imin);
        //собсно замена
        numbers[imin] = max;
        numbers[imax] = min;
        //И выводим второй массив
        System.out.println("Второй массив: " + Arrays.toString(numbers));
    }
}
