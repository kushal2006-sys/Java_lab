interface Shape2 {
    double getPerimeter();
public static void main(String[] args) {
        Rectangle rectangle = Shape2Factory.createRectangle(5, 10);
        Circle circle = Shape2Factory.createCircle(7);
        Triangle triangle = Shape2Factory.createTriangle(3, 4, 5);
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
        System.out.println("Kushal CSE24333 CSE-C");
    }
}
class Rectangle implements Shape2 
    private final double width;
    private final double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}
class Circle impl
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
class Triangle implements Shape2 {
    private final double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getPerimeter() {
        return this.a + this.b + this.c;
    }
}
class Shape2Factory {
    public static Rectangle createRectangle(double width, double height) {
        return new Rectangle(width, height);
    }
    public static Circle createCircle(double radius) {
        return new Circle(radius);
    }
    public static Triangle createTriangle(double a, double b, double c) {
        return new Triangle(a, b, c);
    }
}
public class Shape2Main {
    public static double getPerimeter(Shape2 shape) {
        return shape.getPerimeter();
    }
    public static void main(String[] args) {
        Rectangle rectangle = Shape2Factory.createRectangle(5, 10);
        Circle circle = Shape2Factory.createCircle(7);
        Triangle triangle = Shape2Factory.createTriangle(3, 4, 5);
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
        System.out.println("Kushal CSE24333 CSE-C");
    }
}
