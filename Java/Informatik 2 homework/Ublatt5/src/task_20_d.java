import java.util.Random;
import java.util.stream.IntStream;

public class task_20_d {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(1, 10001);
        IntStream stream = IntStream.range(1, n);
        stream = stream.filter(x -> n % x == 0);
        long count = stream.count();
        System.out.println(count);

        // or
        // long count = IntStream.range(1, n).filter(x -> n % x == 0).count();
    }
}
