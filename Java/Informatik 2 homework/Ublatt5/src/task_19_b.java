import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class task_19_b {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.addAll(Arrays.asList(args));
        myList.add("Rezept Käsekuchen");
        for (String word : myList) {
            System.out.println(word);
        }
        UnaryOperator<String> makeAsciiSafe = s -> s.replaceAll("[^\\x00-\\x7F]", "");

        System.out.println();

        myList.replaceAll(makeAsciiSafe);
        myList.replaceAll(s -> s + ".txt");
        myList.forEach(System.out::println);
    }
}
