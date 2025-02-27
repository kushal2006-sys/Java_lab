public class SimpleInterestCalculator{   
     public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter the principal amount (in rupees): ");
            double principal = scanner.nextDouble();
            System.out.print("Enter the annual interest rate (in %): ");
            double rate = scanner.nextDouble();
            System.out.print("Enter the time period (in years): ");
            int time = scanner.nextInt();
            double simpleInterest = (principal * rate * time) / 100;
            System.out.println("Simple Interest: ₹" + simpleInterest);
        }
    }
}