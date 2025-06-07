import java.util.Random;

public class task_16_a {
    static public void main(String[] args) {
        Random rand = new Random();
        char ch = (char) rand.nextInt(256);
        ;
        System.out.println(Character.getName(ch));
        System.out.println(ch);
        if (Character.MATH_SYMBOL == Character.getType(ch)) {
            System.out.println("Das Zeichen ist ein mathematisches Symbol.");
        } else {
            System.out.println("Das Zeichen ist kein mathematisches Symbol.");
        }

    }
}
