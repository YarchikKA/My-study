import java.util.ArrayList;
import java.util.Random;

public class task_20_a {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(101);
        ArrayList<Integer> list = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < n; i++) {
            list.add(ran.nextInt(1, 10001));
        }
        list.removeIf(x -> x % 2 == 1);
        list.forEach(x -> {
            if (x > 900) {
                System.out.println(x);
            }
        });
    }
}
