import java.util.*;
import java.io.*;

class File_work {

    public static void main(String args[]) throws Exception {

        FileReader fReader = new FileReader("src/main/java/homework.txt");// путь к расположению файла. у меня такой :)
        Scanner scan = new Scanner(fReader);

        ArrayList<String> words = new ArrayList<String>();

        while (scan.hasNext()) {
            words.add(scan.next());
        }
        Collections.sort(words);// Сортируем список по алфавиту

        int maxCount = 0;//Максимальное число повторений (для дальнейшего вывода)
        String maxRep = words.get(0);//Слово, с макс. кол-ом повторений (по умолчанию первый элемент массива)

        for (int i = 0; i < words.size(); i++) {
            int count = 0;//Текущее число повторений (для цикла ниже)
            for (int j = 0; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) { // Сравниваем строки. если одинаковые - увеличиваем счетчик на 1
                    count++;
                }
                if (maxCount < count) {
                    maxCount = count;
                    maxRep = words.get(i);
                }
            }
            System.out.println(words.get(i) + "\nКоличество повторений: " + count);//Печатаем в консоль слово и ниже количество повторений
        }
        System.out.println("Слово с максимальным количеством повторений: " + maxRep + ", количество повторений: " + maxCount);
        fReader.close();// Не забываем закрыть!

    }
}
