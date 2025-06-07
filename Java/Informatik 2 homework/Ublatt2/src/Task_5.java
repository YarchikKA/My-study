import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        int[] inArr = new int[100];
        Scanner input = new Scanner(System.in);
        int amount = 0;
        while (input.hasNextInt()) {
            inArr[amount] = input.nextInt();
            amount += 1;
        }
        if (amount == 0) {
            System.exit(1);
        }
        System.out.println(amount);
        System.out.println(Arrays.toString(inArr));

        double[] dArr;
        if (amount % 2 == 0) {
            dArr = new double[amount / 2];
            for (int i = 0, j = 0; i < amount; i += 2, j++) {
                dArr[j] = (inArr[i] + inArr[i + 1]) / 2.0;
            }
        } else {
            dArr = new double[amount / 2 + 1];
            for (int i = 0, j = 0; i < amount - 1; i += 2, j++) {
                dArr[j] = (inArr[i] + inArr[i + 1]) / 2.0;
            }
            dArr[dArr.length - 1] = (double) inArr[amount - 1];
        }
        System.out.println(Arrays.toString(dArr));
    }
}