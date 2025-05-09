package at.bischof.games.vehicles;

public class Train implements vehicle {

    private String name;
    private int id;

    public Train (String name, int id) {
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
        System.out.println("Train " + name + " is moving on tracks.");
    }
}
