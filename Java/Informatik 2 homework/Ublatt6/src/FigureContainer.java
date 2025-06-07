import java.util.ArrayList;
import java.util.Iterator;

public class FigureContainer implements Iterable<Figure> {
    static ArrayList<Figure> figures = new ArrayList<>();

    @Override
    public Iterator<Figure> iterator() {
        return figures.iterator();
    }

    public void add(Figure fA) throws IllegalArgumentException {
        boolean flag = true;
        for (Figure fig : figures) {
            if (fig.equals(fA)) {
                throw new IllegalArgumentException(fA.toString());
            }
        }
        figures.add(fA);

    }
}
