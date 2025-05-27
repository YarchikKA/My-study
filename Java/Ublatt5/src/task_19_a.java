import java.util.ArrayList;
import java.util.Random;
import java.util.function.DoubleSupplier;

public class task_19_a {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        DoubleSupplier mySupplier = Math::random;
        Random rand = new Random();
        int n = rand.nextInt(1, 1001);
        for (int i = 0; i < n; i++) {
            myList.add(mySupplier.getAsDouble());
            if (Math.random() < 0.01) {
                mySupplier = () -> 2.0;
            }
        }

        myList.removeIf(x -> x < 1.0);
        System.out.println("Amount of added " + n);
        System.out.println("Amount of existed " + myList.size());

    }
}
