/// import java.util.Random;

public class Solution_task_1 {
    public static void main(String[] args) {

        System.out.println("a)");
        double antwortA = Math.sin(1.2) + Math.cos(2.3) - (Math.log(10) / Math.sqrt(7));
        System.out.println(antwortA);

        System.out.println("b)");
        int ran = 10 + (int) (Math.random() * 101);
        //Andere Möglichkeit
        //Random rand = new Random();
        //int ran = rand.nextInt(1001)
        int count = 1;
        for (int i = 2; i < (int) Math.sqrt(ran) + 1; i++) {
            if (ran % i == 0) {
                count += 1;
            }
        }
        if (count == 1) {
            System.out.println(ran + " ist eine Primzahl");
        } else {
            System.out.println(ran + " ist keine Primzahl");
        }

        System.out.println("c)");
        int num1 = (int) (Math.random() * 21);
        int num2 = (int) (Math.random() * 61);
        int a = num1;
        int b = num2;
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        System.out.println((num1 * num2) / a);

        System.out.println("d)");
        String line = "Java Programmierung";
        line = line.toLowerCase();
        line = line.replace(" ", "");
        System.out.print(line.repeat(5));


    }
}


