import java.util.Random;

public class Solution_task_4 {
    public static void main(String[] args) {
        int[] a = randomArray(10, -100, 100);
        printArray(a);
        int[] b = flipSign(a);
        printArray(b);
        System.out.print("a: " + arrayMin(a) + " b:" + arrayMin(b));
    }

    static int arrayMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]" + '\n');
    }

    static int[] randomArray(int len, int start, int end) {
        Random rand = new Random();
        int[] antwort = new int[len];
        for (int i = 0; i < len; i++) {
            antwort[i] = rand.nextInt(start, end) + 1;
        }
        return antwort;
    }

    static int[] flipSign(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i] * -1;
        }
        return res;
    }

}

