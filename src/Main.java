import java.util.Scanner; // объект класса Scanner для чтения ввода с клавиатуры.

public class Main {
    public static void main(String[] args) {
        //Создаем объект для считывания ввода с клавиатуры, выводим сообщение о просьбе ввести кол-во строк
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // считываем конец строки после ввода числа

        String[] strings = new String[n]; // Создаем массив строк

        // Ввод строк с консоли
        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Вычисление средней длины строк
        double sum = 0;
        for (String str : strings) { // по каждой строке в массиве.
            sum += str.length();
        }
        double averageLength = sum / n;

        // Вывод строк, длина которых меньше средней, и их длины
        System.out.println("Строки, длина которых меньше средней (" + averageLength + "):");
        for (String str : strings) {
            if (str.length() < averageLength) {
                System.out.println(str + " (длина = " + str.length() + ")");
            }
        }
    }
}
