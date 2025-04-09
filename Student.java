class Student {
    protected String name;
    protected double percentage;
    public Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Percentage: " + percentage + "%");
    }
}
class UGStudent extends Student {
    public UGStudent(String name, double percentage) {
        super(name, percentage);
    }
    public void checkEligibility() {
        displayInfo();
        if (percentage >= 60) {
            System.out.println("Eligible for UG Admission.");
        } else {
            System.out.println("Not eligible for UG Admission.");
        }
    }
}
class PGStudent extends Student {
    public PGStudent(String name, double percentage) {
        super(name, percentage);
    }
    public void checkEligibility() {
        displayInfo();
        if (percentage >= 70) {
            System.out.println("Eligible for PG Admission.");
        } else {
            System.out.println("Not eligible for PG Admission.");
        }
    }
}
public class AdmissionSystem {
    public static void main(String[] args) {
        UGStudent ug = new UGStudent("Alice", 65.5);
        PGStudent pg = new PGStudent("Bob", 68.0);
        System.out.println("UG Admission Check:");
        ug.checkEligibility();
        System.out.println("\nPG Admission Check:");
        pg.checkEligibility();
    }
}
