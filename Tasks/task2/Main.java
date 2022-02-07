package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = 2;
        System.out.print("Введите число: ");
        try {
            int digit = scanner.nextInt();
            System.out.print("Число, разложенное на простые множители = ");
            while (digit > 1) {
                while (digit % d == 0) {
                    if ((digit / d) == 1)
                        System.out.print(d);
                    else
                        System.out.print(d + " * ");
                    digit /= d;
                }
                if (d == 2)
                    d++;
                else
                    d += 2;
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверный формат числа! ");
        }

    }
}
