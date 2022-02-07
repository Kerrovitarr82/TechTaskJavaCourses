package task5;

public class Safe {
    private final Thing[] things;
    private final int capacity;

    public Safe(Thing[] things, int capacity) {
        this.things = things;
        this.capacity = capacity;
    }

    public Thing max(Thing a, Thing b) {
        return (a.getPrice() > b.getPrice()) ? a : b;
    }

    public Thing sum(Thing a, Thing b) {
        return new Thing(a.getName() + b.getName(), a.getWeight() + b.getWeight(), a.getPrice() + b.getPrice());
    }

    public Thing solve() {
        int i, w;
        Thing[][] S = new Thing[things.length + 1][capacity + 1];
        for (i = 0; i <= things.length; i++) {
            for (w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0)
                    S[i][w] = new Thing("", 0, 0);
                else if (things[i - 1].getWeight() <= w)
                    S[i][w] = max(sum(things[i - 1], S[i - 1][w - things[i - 1].getWeight()]), S[i - 1][w]);
                else
                    S[i][w] = S[i - 1][w];
            }
        }
        return S[things.length][capacity];
    }
}
