class Addition {
    public double add(double a, double b) {
        return a + b;
    }
}
class Subtraction extends Addition {
    public double subtract(double a, double b) {
        return a - b;
    }
}
class Multiplication extends Subtraction {
    public double multiply(double a, double b) {
        return a * b;
    }
}
class Division extends Multiplication {
    public double divide(double a, double b) {
        return a / b;
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Division calc = new Division();
        double num1 = 20;
        double num2 = 5;
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));
    }
}
