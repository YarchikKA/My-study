import java.util.Random;

public class task_16_c {
    static public void main(String[] args) {

        double a = Math.random();

        Random rand = new Random();
        int e = rand.nextInt(0, 100);

        double x = a * Math.pow(10, e);
        System.out.println(x);

        if (Double.isFinite(1 / x)) {
            System.out.println("endlich");
        } else {
            System.out.println("unendlich");
        }

        Double d = Double.valueOf(Double.MIN_VALUE);

        System.out.println(d);

        Double f = Double.valueOf(1 / d.doubleValue());
        System.out.println(f);

        int z = f.intValue();
        System.out.println(z);
    }
}
