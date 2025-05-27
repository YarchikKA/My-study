import java.util.stream.IntStream;

public class task_20_f {
    public static void main(String[] args) {
        int factorial = IntStream.range(1, 11).reduce(1, (x, y) -> x * y);
        System.out.println(factorial);
    }
}
