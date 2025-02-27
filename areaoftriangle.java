import java.util.Scanner;
public class areaoftriangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the length of side A: ");
            double sideA = scanner.nextDouble();
            System.out.print("Enter the length of side B: ");
            double sideB = scanner.nextDouble();
            System.out.print("Enter the length of side C: ");
            double sideC = scanner.nextDouble();
            scanner.close();
            double semiPerimeter = (sideA + sideB + sideC) / 2;
            double area = Math.sqrt(semiPerimeter * 
                                    (semiPerimeter - sideA) * 
                                    (semiPerimeter - sideB) * 
                                    (semiPerimeter - sideC));
            System.out.println("The area of the triangle is: " + area);
        }
    }
}