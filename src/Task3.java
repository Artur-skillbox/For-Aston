import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] values = new int[5];
        System.out.println("Заполните массив:");
       for (int i = 0; i < values.length; i++) {
           int number = scanner.nextInt();
           values[i] = number;
       }
        System.out.println("Массив заполнен, спасибо!");
        System.out.println("Числа массива, кратные 3:");
        for (int value : values) {
            if (value % 3 == 0) {
                System.out.println(value);
            }
        }
    }
}
