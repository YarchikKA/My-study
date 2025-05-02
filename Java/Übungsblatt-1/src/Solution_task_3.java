import java.util.Random;

public class Solution_task_3 {
    public static void main(String[] args) {
        int a = myRandom();
        if (isPrime(a)) {
            System.out.println(true);
        } else {
            System.out.println("next square number: " + nextSquareNumber(a));
        }
    }


    public static int nextSquareNumber(int a) {
        int i = 1;
        while (i * i <= a) {
            i += 1;
        }
        return (i * i);
    }

    public static int myRandom() {
        Random rand = new Random();
        return (1 + rand.nextInt(10000));
    }

    public static boolean isPrime(int a) {
        if (a == 1) return false;
        for (int i = 2; i < (int) Math.sqrt(a) + 1; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}

