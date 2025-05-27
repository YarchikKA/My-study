import java.util.Arrays;
import java.util.stream.Stream;

public class task_20_g {
    public static void main(String[] args) {
        Stream<String> stream = Arrays.stream(args).map(arg -> arg.toUpperCase()).map(arg -> arg.replaceAll("\\d", "")).filter(arg -> !arg.isEmpty());
        stream.forEach(System.out::println);
    }
}
