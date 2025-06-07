public class House {
    String address;
    double squareMeter;

    public House(String address, double squareMeter) {
        if (address != null) {
            this.address = address;
        }
        if (squareMeter > 0) {
            this.squareMeter = squareMeter;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public String toString() {
        String squareF = String.format("%.2f", squareMeter);
        return address + " (" + squareF + "m^2)";
    }
}

