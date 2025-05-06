public class Pet {
    String name;
    int age;
    double weight;


    public Pet(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            this.age = newAge;
        }
    }

    public void setWeight(double newWight) {
        if (newWight >= 0.0) {
            this.weight = newWight;
        }
    }

    public void setName(String newName) {
        this.name = newName;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isLight() {
        return weight < 5.0;
    }
}

