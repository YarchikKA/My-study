public class Solution_task_2 {
    public static void main(String[] args) {
        System.out.println("a)");

        for (String arg : args) {
            System.out.println(arg + " " + arg.length());
        }

        System.out.println("b)");

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }

        System.out.println("c)");
        int count = 0;
        for (String s : args) {
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                if (Character.toLowerCase(aChar) == 'a') {
                    count += 1;
                }
            }
        }
        System.out.println(count);

        System.out.println("d)");
        int sum = 0;
        int amaount = 0;


        for (String arg : args) {
            String[] words = arg.split(" ");
            for (String word : words) {
                System.out.println(word + " " + word.length());
                sum += word.length();
                amaount++;
            }
        }
        System.out.println("durchschnittliche Wortlänge: " + (double) sum / amaount);
    }
}

