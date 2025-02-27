class Student {
    public String Name;
    private String ID;
    private char Section;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public char getSection() {
        return Section;
    }

    public void setSection(char Section) {
        this.Section = Section;
    }

    public void Read() {
        System.out.println("Read");
    }

    public void dance() {
        System.out.println("Dance");
    }

    protected void fight() {
        System.out.println("Fight");
    }

    public static void main(String[] args) {
        Student Ram = new Student();
        Student Hari = new Student();
        Student Krish = new Student();
        Krish.setID("AIE24040");
        Hari.setID("CSE24333");
        Ram.setID("CSE24349");
        Hari.setSection('A');
        Krish.setSection('A');
        

        Ram.setSection('C');
        Ram.Read();                 
        Ram.dance();
        Ram.fight();
        System.out.println("Ram ID: " + Ram.getID()+ " Section : " + Ram.getSection());
        Hari.Read();                 
        Hari.dance();
        Hari.fight();
        
        System.out.println("Hari ID: " + Hari.getID()+ " Section : " + Hari.getSection());
        Krish.Read();                 
        Krish.dance();
        Krish.fight();
        System.out.println("Krish ID: " + Krish.getID()+ " Section : " + Krish.getSection());
    }
}
