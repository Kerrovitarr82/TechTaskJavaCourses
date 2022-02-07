package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pair> pairs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        for (String s : words) {
            pairs.add(new Pair(s));
        }
        Collections.sort(pairs, new Sort());
        Collections.reverse(pairs);
        System.out.println("Слова предложения, отсортированные по количеству гласных по убыванию (Формат: Слово <пробел> Кол-во гласных)\n");
        for (Pair pair : pairs) {
            System.out.println(pair.getStr() + " " + pair.getWeight());
        }
    }
}
