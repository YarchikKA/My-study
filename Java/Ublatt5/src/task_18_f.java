import java.util.HashSet;
import java.util.Random;

public class task_18_f {
    static void checkNum(HashSet<Integer> set, int b) {
        if (set.contains(b)) {
            System.out.println(b + " vorhanden");
        } else {
            System.out.println(b + " nicht vorhanden");
        }
    }

    static int max(HashSet<Integer> set) {
        int max = 1;
        for (int num : set) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    static void setInit(HashSet<Integer> set, int n) {
        Random ran = new Random();
        for (int i = 0; i < n; i++) {
            int a = ran.nextInt(1, 1001);
            set.add(a);
        }
    }

    static void checkEven(HashSet<Integer> set) {
        if (set.size() % 2 == 1) {
            System.out.println("Die Anzahl der Elemente ist ungerade");
        } else {
            System.out.println("Die Anzahl der Elemente ist gerade");
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(101);
        HashSet<Integer> set = new HashSet<Integer>();
        setInit(set, n);
        checkEven(set);
        checkNum(set, 500);
        System.out.println(max(set));
    }
}
