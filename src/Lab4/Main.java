package Lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, которое хотите увидеть в консоли: ");
        ConsoleNumber number = new ConsoleNumber(in.nextLine());
        System.out.println("\nВот ваше красивое число в консоли :)\n");
        number.number_in_console();

        in.close();
    }
}