package task1;

import java.util.Scanner;


public class Main {

    public static boolean containsDigit(String s) {
        boolean containsDigit = false;

        if (s != null && !s.isEmpty()) {
            for (char c : s.toCharArray()) {
                if (containsDigit = Character.isDigit(c)) {
                    break;
                }
            }
        }
        return containsDigit;
    }

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        if (containsDigit(str)) {
            for (char c : str.toCharArray()) {
                if (Character.isDigit(c)) {
                    sum += Character.getNumericValue(c);
                } else {
                    continue;
                }
            }
        }
        System.out.print("Сумма цифр в строке = " + sum);
    }
}
