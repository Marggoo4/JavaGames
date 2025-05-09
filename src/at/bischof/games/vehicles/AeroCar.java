package at.bischof.games.vehicles;

public class AeroCar extends Car {

    public AeroCar(String name, int id) {
        super(name, id);
    }

    public void fly() {
        System.out.println("AeroCar " + getName() + " is flying.");
    }
}
