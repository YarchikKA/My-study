public class Food {
    String name;
    int energyPerGram;

    public Food(String name, int energyPerGram) {
        if (name != null) {
            this.name = name;
        }
        if (energyPerGram > 0) {
            this.energyPerGram = energyPerGram;
        }
    }

    public int getEnergyPerGram() {
        return energyPerGram;
    }

    public void setEnergyPerGram(int energyPerGram) {
        this.energyPerGram = energyPerGram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
