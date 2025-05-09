package at.bischof.games.vehicles;

public class Car implements vehicle {

    private String name;
    private int id;

    public Car(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void drive() {
        System.out.println("Car " + name + " is driving.");
    }
}
