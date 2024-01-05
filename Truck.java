public class Truck extends Car {
    int model;

    public Truck() {

    }

    public Truck(int name, String color) {
        this.name = name;
        this.color = color;
    }

    public Truck(int name, String color, int model) {
        super(name, color); // Super must be called first
        this.model = model;
    }

    @Override
    public void Honk() {
        System.out.println("Truck noise");
    }
}
