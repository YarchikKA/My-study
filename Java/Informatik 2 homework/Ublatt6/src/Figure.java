public class Figure {
    String name;
    int x;
    int y;

    public Figure() {
        this.name = "Knight of Javaland";
        this.x = 0;
        this.y = 0;
    }

    public Figure(String name) {
        this.name = name;
        this.x = 0;
        this.y = 0;
    }


    public Figure(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return name + " @ " + "[" + x + "," + " " + y + "]";
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public boolean equals(Figure f1) {
        return f1.getX() == this.x && f1.getY() == this.y;
    }
}
