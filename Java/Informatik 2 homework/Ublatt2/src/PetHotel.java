public class PetHotel {
    public static void main(String[] args) {
        Pet p1 = new Pet("Luna", 3, 4.2);
        Pet p2 = new Pet("Max", 5, 6.8);
        p2.setWeight(p2.getWeight() - 2.0);

        Pet leightPet = null;

        if (p2.isLight() && p1.isLight()) {
            if (p2.getWeight() < p1.getWeight()) {
                leightPet = p2;
            } else {
                leightPet = p1;
            }
        } else if (p2.isLight() && !p1.isLight()) {
            leightPet = p2;
        } else if (!p2.isLight() && p1.isLight()){
            leightPet = p1;
        }

        if (leightPet == null) {
            System.out.println("Beide Tiere sind nicht leicht, aber dieses ist leichter:");
            if (p2.getWeight() < p1.getWeight()) {
                System.out.println(p2.getName() + " " + p2.getAge() + " " + p2.getWeight());
            } else {
                System.out.println(p1.getName() + " " + p1.getAge() + " " + p1.getWeight());
            }
        } else {
            System.out.println(leightPet.getName() + " " + leightPet.getAge() + " " + leightPet.getWeight());

        }


    }
}
