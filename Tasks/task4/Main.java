package task4;

import java.util.Scanner;

public class Main {
    public static void printDigit(char[][] num) {
        for (char[] c : num) {
            System.out.println();
            for (char i : c)
                System.out.print(i);
        }
    }

    public static char[][] append(char[][] a, char[][] b) {
        char[][] C = new char[a.length][a[0].length + b[0].length];
        int counter = 0;
        for (int i = 0; i < C.length; i++) {
            char[] row = new char[C[0].length];
            for (int j = 0; j < a[0].length; j++)
                row[counter++] = a[i][j];
            for (int j = 0; j < b[0].length; j++)
                row[counter++] = b[i][j];
            C[i] = row;
            counter = 0;
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String num = scanner.next();
        int number = Integer.parseInt(num);
        char[][] zero = {{'*', '*', '*', ' '}, {'*', ' ', '*', ' '}, {'*', ' ', '*', ' '}, {'*', ' ', '*', ' '}, {'*', '*', '*', ' '}};
        char[][] one = {{' ', ' ', '*', ' '}, {' ', '*', '*', ' '}, {'*', ' ', '*', ' '}, {' ', ' ', '*', ' '}, {' ', ' ', '*', ' '}};
        char[][] two = {{'*', '*', '*', ' '}, {' ', ' ', '*', ' '}, {'*', '*', '*', ' '}, {'*', ' ', ' ', ' '}, {'*', '*', '*', ' '}};
        char[][] three = {{'*', '*', '*', ' '}, {' ', ' ', '*', ' '}, {'*', '*', '*', ' '}, {' ', ' ', '*', ' '}, {'*', '*', '*', ' '}};
        char[][] four = {{'*', ' ', '*', ' '}, {'*', ' ', '*', ' '}, {'*', '*', '*', ' '}, {' ', ' ', '*', ' '}, {' ', ' ', '*', ' '}};
        char[][] five = {{'*', '*', '*', ' '}, {'*', ' ', ' ', ' '}, {'*', '*', '*', ' '}, {' ', ' ', '*', ' '}, {'*', '*', '*', ' '}};
        char[][] six = {{'*', '*', '*', ' '}, {'*', ' ', ' ', ' '}, {'*', '*', '*', ' '}, {'*', ' ', '*', ' '}, {'*', '*', '*', ' '}};
        char[][] seven = {{'*', '*', '*', ' '}, {' ', ' ', '*', ' '}, {' ', ' ', '*', ' '}, {' ', ' ', '*', ' '}, {' ', ' ', '*', ' '}};
        char[][] eight = {{'*', '*', '*', ' '}, {'*', ' ', '*', ' '}, {'*', '*', '*', ' '}, {'*', ' ', '*', ' '}, {'*', '*', '*', ' '}};
        char[][] nine = {{'*', '*', '*', ' '}, {'*', ' ', '*', ' '}, {'*', '*', '*', ' '}, {' ', ' ', '*', ' '}, {'*', '*', '*', ' '}};
        char[][] zeroBig = {{'0', '0', '0', ' '}, {'0', ' ', '0', ' '}, {'0', ' ', '0', ' '}, {'0', ' ', '0', ' '}, {'0', '0', '0', ' '}};
        char[][] oneBig = {{' ', ' ', '1', ' '}, {' ', '1', '1', ' '}, {'1', ' ', '1', ' '}, {' ', ' ', '1', ' '}, {' ', ' ', '1', ' '}};
        char[][] twoBig = {{'2', '2', '2', ' '}, {' ', ' ', '2', ' '}, {'2', '2', '2', ' '}, {'2', ' ', ' ', ' '}, {'2', '2', '2', ' '}};
        char[][] threeBig = {{'3', '3', '3', ' '}, {' ', ' ', '3', ' '}, {'3', '3', '3', ' '}, {' ', ' ', '3', ' '}, {'3', '3', '3', ' '}};
        char[][] fourBig = {{'4', ' ', '4', ' '}, {'4', ' ', '4', ' '}, {'4', '4', '4', ' '}, {' ', ' ', '4', ' '}, {' ', ' ', '4', ' '}};
        char[][] fiveBig = {{'5', '5', '5', ' '}, {'5', ' ', ' ', ' '}, {'5', '5', '5', ' '}, {' ', ' ', '5', ' '}, {'5', '5', '5', ' '}};
        char[][] sixBig = {{'6', '6', '6', ' '}, {'6', ' ', ' ', ' '}, {'6', '6', '6', ' '}, {'6', ' ', '6', ' '}, {'6', '6', '6', ' '}};
        char[][] sevenBig = {{'7', '7', '7', ' '}, {' ', ' ', '7', ' '}, {' ', ' ', '7', ' '}, {' ', ' ', '7', ' '}, {' ', ' ', '7', ' '}};
        char[][] eightBig = {{'8', '8', '8', ' '}, {'8', ' ', '8', ' '}, {'8', '8', '8', ' '}, {'8', ' ', '8', ' '}, {'8', '8', '8', ' '}};
        char[][] nineBig = {{'9', '9', '9', ' '}, {'9', ' ', '9', ' '}, {'9', '9', '9', ' '}, {' ', ' ', '9', ' '}, {'9', '9', '9', ' '}};

        int maxDigit = 0;
        int digit = number;
        int curDigit;
        while (digit > 0) {
            curDigit = digit % 10;
            if (curDigit > maxDigit)
                maxDigit = curDigit;
            digit /= 10;
        }
        System.out.println("Наибольшая цифра числа = " + maxDigit);

        char[][] c = null;
        boolean first = true;
        for (char chars : num.toCharArray()) {
            if (first) {
                first = false;
                switch (chars) {
                    case '0':
                        if (maxDigit == 0)
                            c = zeroBig;
                        else
                            c = zero;
                        break;
                    case '1':
                        if (maxDigit == 1)
                            c = oneBig;
                        else
                            c = one;
                        break;
                    case '2':
                        if (maxDigit == 2)
                            c = twoBig;
                        else
                            c = two;
                        break;
                    case '3':
                        if (maxDigit == 3)
                            c = threeBig;
                        else
                            c = three;
                        break;
                    case '4':
                        if (maxDigit == 4)
                            c = fourBig;
                        else
                            c = four;
                        break;
                    case '5':
                        if (maxDigit == 5)
                            c = fiveBig;
                        else
                            c = five;
                        break;
                    case '6':
                        if (maxDigit == 6)
                            c = sixBig;
                        else
                            c = six;
                        break;
                    case '7':
                        if (maxDigit == 7)
                            c = sevenBig;
                        else
                            c = seven;
                        break;
                    case '8':
                        if (maxDigit == 8)
                            c = eightBig;
                        else
                            c = eight;
                        break;
                    case '9':
                        if (maxDigit == 9)
                            c = nineBig;
                        else
                            c = nine;
                        break;
                }
            } else {
                switch (chars) {
                    case '0':
                        if (maxDigit == 0)
                            c = append(c, zeroBig);
                        else
                            c = append(c, zero);
                        break;
                    case '1':
                        if (maxDigit == 1)
                            c = append(c, oneBig);
                        else
                            c = append(c, one);
                        break;
                    case '2':
                        if (maxDigit == 2)
                            c = append(c, twoBig);
                        else
                            c = append(c, two);
                        break;
                    case '3':
                        if (maxDigit == 3)
                            c = append(c, threeBig);
                        else
                            c = append(c, three);
                        break;
                    case '4':
                        if (maxDigit == 4)
                            c = append(c, fourBig);
                        else
                            c = append(c, four);
                        break;
                    case '5':
                        if (maxDigit == 5)
                            c = append(c, fiveBig);
                        else
                            c = append(c, five);
                        break;
                    case '6':
                        if (maxDigit == 6)
                            c = append(c, sixBig);
                        else
                            c = append(c, six);
                        break;
                    case '7':
                        if (maxDigit == 7)
                            c = append(c, sevenBig);
                        else
                            c = append(c, seven);
                        break;
                    case '8':
                        if (maxDigit == 8)
                            c = append(c, eightBig);
                        else
                            c = append(c, eight);
                        break;
                    case '9':
                        if (maxDigit == 9)
                            c = append(c, nineBig);
                        else
                            c = append(c, nine);
                        break;
                }
            }
        }

//        if (reversed == 0)
//            c = zeroBig;
//        else {
//            while (reversed > 0) {
//                digit = reversed % 10;
//                if (first) {
//                    first = false;
//                    switch (digit) {
//                        case 0:
//                            c = zero;
//                            break;
//                        case 1:
//                            if (maxDigit == 1)
//                                c = oneBig;
//                            else
//                                c = one;
//                            break;
//                        case 2:
//                            if (maxDigit == 2)
//                                c = twoBig;
//                            else
//                                c = two;
//                            break;
//                        case 3:
//                            if (maxDigit == 3)
//                                c = threeBig;
//                            else
//                                c = three;
//                            break;
//                        case 4:
//                            if (maxDigit == 4)
//                                c = fourBig;
//                            else
//                                c = four;
//                            break;
//                        case 5:
//                            if (maxDigit == 5)
//                                c = fiveBig;
//                            else
//                                c = five;
//                            break;
//                        case 6:
//                            if (maxDigit == 6)
//                                c = sixBig;
//                            else
//                                c = six;
//                            break;
//                        case 7:
//                            if (maxDigit == 7)
//                                c = sevenBig;
//                            else
//                                c = seven;
//                            break;
//                        case 8:
//                            if (maxDigit == 8)
//                                c = eightBig;
//                            else
//                                c = eight;
//                            break;
//                        case 9:
//                            if (maxDigit == 9)
//                                c = nineBig;
//                            else
//                                c = nine;
//                            break;
//                    }
//                } else {
//                    switch (digit) {
//                        case 0:
//                            c = append(c, zero);
//                            break;
//                        case 1:
//                            if (maxDigit == 1)
//                                c = append(c, oneBig);
//                            else
//                                c = append(c, one);
//                            break;
//                        case 2:
//                            if (maxDigit == 2)
//                                c = append(c, twoBig);
//                            else
//                                c = append(c, two);
//                            break;
//                        case 3:
//                            if (maxDigit == 3)
//                                c = append(c, threeBig);
//                            else
//                                c = append(c, three);
//                            break;
//                        case 4:
//                            if (maxDigit == 4)
//                                c = append(c, fourBig);
//                            else
//                                c = append(c, four);
//                            break;
//                        case 5:
//                            if (maxDigit == 5)
//                                c = append(c, fiveBig);
//                            else
//                                c = append(c, five);
//                            break;
//                        case 6:
//                            if (maxDigit == 6)
//                                c = append(c, sixBig);
//                            else
//                                c = append(c, six);
//                            break;
//                        case 7:
//                            if (maxDigit == 7)
//                                c = append(c, sevenBig);
//                            else
//                                c = append(c, seven);
//                            break;
//                        case 8:
//                            if (maxDigit == 8)
//                                c = append(c, eightBig);
//                            else
//                                c = append(c, eight);
//                            break;
//                        case 9:
//                            if (maxDigit == 9)
//                                c = append(c, nineBig);
//                            else
//                                c = append(c, nine);
//                            break;
//                    }
//                }
//                reversed /= 10;
//            }
//        }
        printDigit(c);
    }
}
