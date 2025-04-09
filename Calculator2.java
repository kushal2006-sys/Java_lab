class Calculator2 {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        int sum1 = calc.add(10, 20);
        double sum2 = calc.add(12.5, 7.3);
        int sum3 = calc.add(5, 10, 15);
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of two doubles: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
    }
}
