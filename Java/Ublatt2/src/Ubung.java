import java.util.Random;

public class Ubung {
    public static void main(String[] args) {
        Random rng1 = new Random();
        Random rng2 = new Random(42);
        int ri1 = rng2.nextInt(100, 1000);
        int ri2 = 100 + rng2.nextInt(1000);
        boolean rb2 = rng2.nextBoolean();
        int ri3 = rng2.nextInt(100, 1000);
        int ri4 = rng2.nextInt(100, 1000);

        System.out.println(ri1 + " " + ri2 + " " + rb2 + " " + ri3 + " " + ri4);

        Random rng3 = new Random(42);

        int ri13 = rng3.nextInt(100, 1000);
        int ri23 = rng3.nextInt(100, 1000);
        int ri33 = rng3.nextInt(100, 1000);
        int ri43 = rng3.nextInt(100, 1000);

        System.out.println(ri13 + " " + ri23 + " " + " " + ri33 + " " + ri43);

        int ri11 = rng1.nextInt(100, 1000);
        int ri21 = rng1.nextInt(100, 1000);
        System.out.println(ri11 + " " + ri21);

        rng1.setSeed(42);
        int ri31 = rng2.nextInt(100, 1000);
        int ri41 = 100 + rng2.nextInt(1000);
        boolean rb1 = rng2.nextBoolean();
        int ri51 = rng2.nextInt(100, 1000);
        int ri61 = rng2.nextInt(100, 1000);
        System.out.print(ri31 + " " + ri41 + " " + " " + rb1 + " " + ri51 + " " + ri61);

    }
}
