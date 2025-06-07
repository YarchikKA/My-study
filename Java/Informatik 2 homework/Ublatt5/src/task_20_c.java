import java.util.Random;
import java.util.stream.IntStream;

public class task_20_c {
    public static void main(String[] args) {
        Random rand = new Random();
        IntStream stream = IntStream.generate(() -> rand.nextInt(101));
        stream = stream.limit(10);
        stream = stream.sorted();
        stream.forEach(System.out::println);
    }
}
