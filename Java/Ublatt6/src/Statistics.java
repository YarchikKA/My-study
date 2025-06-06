public class Statistics {
    double len;
    int countDigit;

    public Statistics(double len, int countDigit) {
        this.len = len;
        this.countDigit = countDigit;
    }

    public double getLen() {
        return len;
    }

    public int getCountDigit() {
        return countDigit;
    }

    public void setCountDigit(int countDigit) {
        this.countDigit = countDigit;
    }

    public void setLen(double len) {
        this.len = len;
    }
}
