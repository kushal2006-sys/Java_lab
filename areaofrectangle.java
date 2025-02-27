import java.util.Scanner;
public class areaofrectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of the rectangle:");
            double length = sc.nextDouble();
            System.out.println("Enter the breadth of the rectangle:");
            double breadth = sc.nextDouble();
            double area = length * breadth;
            System.out.println("The area of the rectangle is: " + area);
        }
    }
}