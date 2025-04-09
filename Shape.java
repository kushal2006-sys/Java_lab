class Shape {
    public double calculateArea(double side) {
        return side * side;
    }
    public double calculateArea(double length, double width) {
        return length * width;
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(5.0);
        double squareArea = shape.calculateArea(4.0);
        double rectangleArea = shape.calculateArea(5.0, 3.0);
        double circleArea = circle.calculateArea();
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}