import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Введите число:");;
            int number = scanner.nextInt();
            if (number > 7) {
                System.out.println("Привет");
            }
        }
    }
}
