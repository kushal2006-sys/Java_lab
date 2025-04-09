class Vehicle2 {
    protected String brand;
    protected int speed;
    public Vehicle2(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void start() {
        System.out.println(brand + " is starting...");
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}
class Car extends Vehicle2 {
    private int noofDoors;
    public Car(String brand, int speed, int noofDoors) {
        super(brand, speed);
        this.noofDoors = noofDoors;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + noofDoors);
    }
}
class Bike extends Vehicle2 {
    private boolean hasGears;
    public Bike(String brand, int speed, boolean hasGears) {
        super(brand, speed);
        this.hasGears = hasGears;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Gears: " + (hasGears ? "Yes" : "No"));
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 180, 4);
        Bike bike1 = new Bike("Yamaha", 120, true);
        System.out.println("Car Details:");
        car1.displayDetails();
        car1.start();
        System.out.println("\nBike Details:");
        bike1.displayDetails();
        bike1.start();
    }
}
