# Java_lab
java lab repository according to the weeks 
<!--week1-->
class Main 
{
    public static void main (String [] args) 
    {
        System.out.println("Name: T.Kushal");
        System.out.println("Section: CSE-C");
        System.out.println("Roll No: 24333");
    }
}

<!--next code-->
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
} area of rectangle

<!--next code-->
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
} area of triangle

<!--next code-->
public class Conversion {
    public static void(String [] args){
    scanner scanner = new scanner(System.in);
    System.out.println("Enter the temperature in Celcius: ");
    double celcius = scanner.nextDouble();
    double fahrenheit = (celcius * 9/5) + 32;
    System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
     }
} celcius to Fahrenheit

<!-- next code-->
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
} factorial

<!--next code-->
import java.util.Scanner;
public class Fibinaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to print:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
} fibinacci

<!-- next code-->
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
} simple interest

<!--next code-->
import java.util.Scanner;
public class Conversion2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
            scanner.close();
        }
    }
} Fahrenheit to celsius

<!--next coed-->
import java.util.Scanner;

class BankAccount {
    private float existing; // Class-level variable to store balance
    private Scanner input;  // Single Scanner instance for input
    // Constructor
    public BankAccount() {
        input = new Scanner(System.in);
        System.out.print("Enter existing amount in bank account: ");
        this.existing = input.nextFloat();
    }
    // Deposit method
    public void deposit() {
        System.out.print("Enter amount to be deposited: ");
        float deposit = input.nextFloat();
        existing += deposit;
        System.out.println("Existing amount now is: " + existing);
    }
    // Withdrawal method
    public void withdrawal() {
        System.out.print("Enter amount to be withdrawn: ");
        float withdrawal = input.nextFloat();
        if (existing < withdrawal) {
            System.out.println("Not sufficient balance.");
        } else {
            existing -= withdrawal;
            System.out.println("Remaining balance: " + existing);
        }
    }
    // Main method
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount();
        customer1.deposit();
        customer1.withdrawal();
    }
}
<!-- next code-->

class car
{
	public String car_color;
	public String car_brand;
	public String fuel_type;
	public float mileage;
	public void start()
	{
		System.out.println("Car starts");
	}
	public void stop()
	{
		System.out.println("Car stops");
	}
	public void service()
	{
		System.out.println("Car service");
	}
	public static void main(String [] args){
  			// object one creation
			car car1= new car();
			car1.car_color="Red";
			car1.car_brand="BMW";
			car1.fuel_type="Petrol";
			car1.mileage=62.5F;
			//calling methods for object 1
			car1.start();
			car1.stop();
			car1.service();
			System.out.println("color of the car1 is "+car1.car_color);
			System.out.println("brand of the car1 is "+car1.car_brand);
			System.out.println("fuel type of the car1 is "+car1.fuel_type);
			System.out.println("mileage of the car1 is"+car1.mileage);
			// object two creation
			car car2= new car();
			car2.car_color="Blue";
			car2.car_brand="Audi";
			car2.fuel_type="Petrol";
			car2.mileage=64.5F;
			// calling methods for object 2
			car2.start();
			car2.stop();
			car2.service();
			System.out.println("color of the car2 is "+car2.car_color);
			System.out.println("brand of the car2 is "+car2.car_brand);
			System.out.println("fuel type of the car2 is "+car2.fuel_type);
			System.out.println("mileage of the car2 is"+car2.mileage);
			//object three creation
			car car3= new car();
			car3.car_color="Yellow";
			car3.car_brand="Benz";
			car3.fuel_type="Diesel";
			car3.mileage=66.5F;	
			// calling methods for object 3
			car3.start();
			car3.stop();
			car3.service();
			System.out.println("color of the car3 is "+car3.car_color);
			System.out.println("brand of the car3 is "+car3.car_brand);
			System.out.println("fuel type of the car3 is "+car3.fuel_type);
			System.out.println("mileage of the car3 is"+car3.mileage);
	}

}
