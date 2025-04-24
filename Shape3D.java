abstract class Shape3D {
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}
class Sphere extends Shape3D {
    private final double radius;
    Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateVolume() 
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    @Override
    double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
class Cube extends Shape3D {
    private final double sideLength;
    Cube(double sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    double calculateVolume() {
        return Math.pow(sideLength, 3);
    }
    @Override
    double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}
public class Shape3DTest {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());
        Cube cube = new Cube(3);
        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());
        System.out.println("Kushal CSE24333 CSE-C");
    }
}