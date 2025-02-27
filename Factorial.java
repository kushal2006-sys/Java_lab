import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number=scanner.nextInt();
            long result = factorial(number);
            System.out.println("Factorial of " + number + " is " + result);
        }
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}