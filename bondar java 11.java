import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1
        System.out.println("Введите два целых числа a и b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление на ноль невозможно.");
        }

        // Задача 2
        System.out.println("Введите две строки a и b:");
        scanner.nextLine(); 
        String strA = scanner.nextLine();
        String strB = scanner.nextLine();

        
        if (strA.equals(strB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // Задача 3
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Чётные числа из массива:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
