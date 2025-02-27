import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Enter the temperature in Celcius: ");
        double celcius = scanner.nextDouble();
        double fahrenheit = (celcius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
    }
     }
}