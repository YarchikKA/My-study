public class GuardDog {
    String name;
    int energy;
    House house;

    public GuardDog(String name, int energy, House house) {
        if (name != null) {
            this.name = name;
        }
        if (energy > 0) {
            this.energy = energy;
        }
        this.house = house;
    }

    public GuardDog(String name, House house) {
        this.name = name;
        this.house = house;
        this.energy = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    int guard(int duration) {
        if (duration <= 0) {
            return 0;
        } else {
            int energyNeed = (int) (duration * (house.getSquareMeter() / 10));
            if (energyNeed > energy) {
                return -1;
            } else {
                energy -= energyNeed;
                return 1;
            }
        }
    }

    boolean feed(Food food, int grams) {
        if (food != null) {
            if (grams <= 0) {
                return false;
            } else {
                energy += grams * food.energyPerGram;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return name + " [house=" + house.toString() + ", current energy=" + energy + "]";
    }
}

