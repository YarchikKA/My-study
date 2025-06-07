import java.util.stream.IntStream;

public class task_20_e {
    public static void main(String[] args) {
        IntStream stream = IntStream.range(1, 22).filter(x -> x % 2 == 1).limit(10);
        int sum = stream.sum();
        System.out.println(sum);
        // or
        // int sum = IntStream.range(1, 22).filter(x -> x % 2 == 1).limit(10).reduce(0, (x, y) -> x + y);
    }
}
