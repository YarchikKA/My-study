public class Package {
    private static double PREIS = 1.5;
    String recipient;
    double weight;
    boolean flag;

    public Package(String recipient, double weight, boolean flag) {
        this.recipient = recipient;
        this.weight = weight;
        this.flag = flag;
    }

    String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        recipient = recipient;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public double getPreis() {
        if (weight < 0.5) {
            return PREIS;
        } else if (weight <= 1) {
            return 2 * PREIS;
        } else {
            return 5 * PREIS;
        }
    }
}
