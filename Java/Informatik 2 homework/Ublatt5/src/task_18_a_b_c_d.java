import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class task_18_a_b_c_d {
    static void arrayInit(ArrayList<Integer> list, int n) {
        Random ran = new Random();
        for (int i = 0; i < n; i++) {
            int a = ran.nextInt(1, 1001);
            list.add(a);
        }
    }

    static void checkNum(ArrayList<Integer> list, int b) {
        if (list.contains(b)) {
            System.out.println(b + " in list");
            System.out.println(list.indexOf(500));

        } else {
            System.out.println(b + " not in list");
        }
    }

    static int max_a(ArrayList<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int max = it.next();
        while (it.hasNext()) {
            int num = it.next();
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    static int max_b(ArrayList<Integer> list) {
        int max = 0;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    static int max_c(ArrayList<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    static int max_d(ArrayList<Integer> list) {
        list.sort(null);
        return list.getLast();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(101);
        ArrayList<Integer> list = new ArrayList<>();
        arrayInit(list, n);
        if (list.size() % 2 == 1) {
            System.out.println(list.get(list.size() / 2));
        } else {
            System.out.println("Die Anzahl der Elemente ist gerade");
        }
        checkNum(list, 500);
        System.out.println(max_a(list));
        System.out.println(max_b(list));
        System.out.println(max_c(list));
        System.out.println(max_d(list));


    }
}
