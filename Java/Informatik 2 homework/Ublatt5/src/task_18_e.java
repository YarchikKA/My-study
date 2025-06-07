import java.util.Random;
import java.util.TreeSet;

public class task_18_e {
    static void checkNum(TreeSet<Integer> set, int b) {
        if (set.contains(b)) {
            System.out.println(b + " vorhanden");
        } else {
            System.out.println(b + " nicht vorhanden");
        }
    }

    static int max(TreeSet<Integer> set) {
        return set.last();
    }

    static void setInit(TreeSet<Integer> set, int n) {
        Random ran = new Random();
        for (int i = 0; i < n; i++) {
            int a = ran.nextInt(1, 1001);
            set.add(a);
        }
    }

    static void checkEven(TreeSet<Integer> set) {
        if (set.size() % 2 == 1) {
            System.out.println("Die Anzahl der Elemente ist ungerade");
        } else {
            System.out.println("Die Anzahl der Elemente ist gerade");
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(101);
        TreeSet<Integer> set = new TreeSet<>();
        setInit(set, n);
        checkEven(set);
        checkNum(set, 500);
        System.out.println(max(set));
    }

}
