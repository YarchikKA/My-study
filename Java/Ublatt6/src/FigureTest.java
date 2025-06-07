public class FigureTest {
    public static void main(String[] args) {
        FigureContainer figures = new FigureContainer();
        try {
            Figure f1 = new Figure("circle", 0, 5);
            figures.add(f1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " Error");
        }

        try {
            Figure f2 = new Figure("triangle", 0, 5);
            figures.add(f2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " Error");
        }

        try {
            Figure f3 = new Figure("qadrat");
            figures.add(f3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " Error");
        }

        try {
            Figure f4 = new Figure();
            figures.add(f4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " Error");
        }

        try {
            Figure f5 = new Figure();
            figures.add(f5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " Error");
        }

        try {
            Figure f6 = new Figure("Small Python", 1, 1);
            figures.add(f6);
            f6.move(-1, -1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " Error");
        }
        System.out.println("-----------------------------------");
        figures.forEach(System.out::println);
    }

}
