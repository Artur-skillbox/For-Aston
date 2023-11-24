import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchName = "Вячеслав";

        while (true) {
            System.out.println("Введите имя:");
            String name = scanner.nextLine();
            if (name.equals(searchName)) {
                System.out.println("Привет, " + searchName);
            } else {
                System.out.println("Нет такого имени");
            }
        }
    }
}
