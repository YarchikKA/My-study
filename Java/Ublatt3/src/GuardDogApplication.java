public class GuardDogApplication {
    static void feed(GuardDog dog, Food food, int grams) {
        System.out.println("Feeding " + grams + "g " + "of " + food.getName() + " to " + dog.getName());
        System.out.print(dog);
        if (dog.feed(food, grams)) {
            System.out.println(" --> Successful! New energy = " + dog.getEnergy());
        } else {
            System.out.println(" --> Failed! Grams must be > 0");
        }
    }

    static void guard(GuardDog dog, int duration) {
        System.out.print("Letting ");
        System.out.print(dog);
        if (dog.guard(duration) == 0) {
            System.out.println("guard for duration of " + duration + "--> Failed! Guard duration must be > 0!");
        } else if (dog.guard(duration) == -1) {
            System.out.println("guard for duration of " + duration + "--> Failed! Guard duration was too long, not enough energy!");
        } else {
            System.out.println("guard for duration of " + duration + "--> Successful! New energy = " + dog.getEnergy());
        }
    }

    public static void main(String[] args) {
        Food f1 = new Food("apple", 10);
        Food f2 = new Food("banana", 5);
        Food f3 = new Food("meet", 30);
        House h1 = new House("Univiertel 1", 100);
        House h2 = new House("Stadbergen 5", 17);
        GuardDog dog1 = new GuardDog("Scharik", 2000, h1);
        GuardDog dog2 = new GuardDog("Bobik", h1);
        LazyGuardDog lazyDog = new LazyGuardDog("Rey", h2);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(lazyDog);
        System.out.println("Feeding:");
        feed(dog1, f1, 5000);
        feed(dog2, f2, -50);
        feed(dog2, f2, 50);
        feed(lazyDog, f3, 10);
        System.out.println("Guarding:");
        guard(dog1, -25);
        guard(dog1, 1);
        guard(dog2, 5);
        guard(dog2, 5);
        guard(lazyDog, 10);
        guard(lazyDog, 200);
    }
}
