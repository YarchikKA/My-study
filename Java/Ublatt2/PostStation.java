public class PostStation {
    public static void main(String[] args) {
        Package p1 = new Package("Max Mustermann", 2, false);
        Package p2 = new Package("Jane Doe", 0.75, true);
        p1.setFlag(true);
        System.out.println("p1 preis: " + p1.getPreis());
        System.out.println("p1 preis: " + p2.getPreis());
    }
}
