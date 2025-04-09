class Vehicle3 {
    protected String brand;
    protected int speed;
    public Vehicle3(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void displayGeneralInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}
class Car extends Vehicle3 {
    private int numberOfDoors;
    private String fuelType;
    public Car(String brand, int speed, int numberOfDoors, String fuelType) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }
    public void displayCarInfo() {
        displayGeneralInfo(); 
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}
public class VehicleInfo {
    public static void main(String[] args) {
        Car car = new Car("Honda", 160, 4, "Petrol");
        car.displayCarInfo();
    }
}
