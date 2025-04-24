abstract class PatternPrinter {
    abstract void printPattern(int n);
}

class StarPattern extends PatternPrinter {
    @Override
    void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class NumberPattern extends PatternPrinter {
    @Override
    void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

public class PatternPrinterTest {
    public static void main(String[] args) {
        PatternPrinter starPattern = new StarPattern();
        PatternPrinter numberPattern = new NumberPattern();
        
        System.out.println("Star Pattern:");
        starPattern.printPattern(5);
        
        System.out.println("Number Pattern:");
        numberPattern.printPattern(5);
        
        System.out.println("Kushal CSE24333 CSE-C");
    }
}