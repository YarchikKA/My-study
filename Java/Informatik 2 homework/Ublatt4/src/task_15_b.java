public class task_15_b {
    public static void main(String[] args) {
        StringBuilder line1 = new StringBuilder("Fischers Fritz fischt frische Fische");

        line1.reverse();
        System.out.println(line1);

        line1.reverse();

        line1.delete(line1.indexOf("Fischers"), line1.indexOf(" ") + 1);

        line1.insert(line1.indexOf("frische") + "frische".length(), ", leckere");

        System.out.println(line1);
    }
}
