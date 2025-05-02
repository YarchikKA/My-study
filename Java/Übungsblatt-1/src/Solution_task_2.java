import java.util.Scanner;

public class Solution_task_2 {
    public static void main(String[] args) {
        System.out.println("a)");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + " " + args[i].length());
        }

        System.out.println("b)");

        for (int i = args.length - 1; i >=  0; i--) {
            System.out.println(args[i]);
        }

        System.out.println("c)");
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            char[] chars = args[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (Character.toLowerCase(chars[j]) == 'a') {
                    count += 1;
                }
            }
        }
        System.out.println(count);
        System.out.println("d)");
        int sum = 0;


        for (int i = 0; i < args.length; i++) {
            sum += args[i].length();
            System.out.println(args[i] + " " + args[i].length());
        }
        System.out.println((double) sum / args.length);
    }
}

