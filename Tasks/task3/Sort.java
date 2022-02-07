package task3;

import java.util.Comparator;

public class Sort implements Comparator<Pair> {
    @Override
    public int compare(Pair o1, Pair o2) {
        if (o1.getWeight() < o2.getWeight())
            return -1;
        else if (o1.getWeight() == o2.getWeight())
            return 0;
        else
            return 1;
    }
}
