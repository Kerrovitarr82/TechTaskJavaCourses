package task5;

public class Main {

    public static void main(String[] args) {
        Thing[] things = {
                new Thing("ob1", 23, 505),
                new Thing("ob2", 26, 352),
                new Thing("ob3", 20, 458),
                new Thing("ob4", 18, 220),
                new Thing("ob5", 32, 354),
                new Thing("ob6", 27, 414),
                new Thing("ob7", 29, 498),
                new Thing("ob8", 26, 545),
                new Thing("ob9", 30, 473),
                new Thing("ob10", 27, 543)
        };
        Safe safe = new Safe(things, 67);

        Thing S = safe.solve();

        System.out.print(S.getName() + " " + S.getWeight() + " " + S.getPrice());
    }

}
