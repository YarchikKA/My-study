import java.util.Random;

public class task_16_b {
    static public void main(String[] args) {
        Random rand = new Random();
        int r = rand.nextInt(-1000, 1000);

        System.out.println("Dezimal: " + r);
        System.out.println("Binary: " + Integer.toBinaryString(r));
        System.out.println("Oktal: " + Integer.toOctalString(r));
        System.out.println("Hex: " + Integer.toHexString(r));

        System.out.println(Integer.signum(r));

        System.out.println(Integer.bitCount(r));

    }
}
