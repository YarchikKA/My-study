public class LazyGuardDog extends GuardDog {

    public LazyGuardDog(String name, int energy, House house) {
        super(name, energy, house);
    }

    public LazyGuardDog(String name, House house) {
        super(name, house);

    }

    int guard(int duration) {
        if (duration <= 0) {
            return 0;
        } else {
            int energyNeed = (int) (duration * (house.getSquareMeter() / 10) * 1.5);
            if (energyNeed > energy) {
                return -1;
            } else {
                energy -= energyNeed;
                return 1;
            }

        }
    }
}
