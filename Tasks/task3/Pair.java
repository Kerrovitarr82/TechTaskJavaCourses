package task3;

public class Pair {
    private int weight; // кол-во гласных
    private String str;

    Pair(String s) {
        str = s.substring(0, 1).toUpperCase() + s.substring(1);
        weightCount();

    }

    private void weightCount() {
        for (char c : str.toCharArray()) {
            if (c == 'а' || c == 'о' || c == 'у' || c == 'э' || c == 'ы' || c == 'я' || c == 'ё' || c == 'е' || c == 'ю' || c == 'и' ||
                    c == 'А' || c == 'О' || c == 'У' || c == 'Э' || c == 'Ы' || c == 'Я' || c == 'Ё' || c == 'Е' || c == 'Ю' || c == 'И')
                weight++;
        }
    }

    public int getWeight() {
        return weight;
    }

    public String getStr() {
        return str;
    }
}
