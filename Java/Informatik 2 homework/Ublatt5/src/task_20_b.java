import java.util.Random;
import java.util.stream.IntStream;

public class task_20_b {
    public static void main(String[] args) {
        Random rand = new Random();
        IntStream stream = rand.ints(500);
        stream = stream.limit(10);
        stream = stream.sorted();
        stream.forEach(System.out::println);
    }
}
