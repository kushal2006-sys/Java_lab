abstract class Animal {
    abstract void makeSound(); 
 public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal lion = new Lion();
        tiger.makeSound(); 
        lion.makeSound();  
        System.out.println("Kushal CSE24333 CSE-C");
    }

}
class Tiger extends Animal {
    @Override
    void makeSound() {
        System.out.println("Tiger Roar");
    }
}
class Lion extends  {
    @Override
    void makeSound() {
        System.out.println("Lion Roar");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal lion = new Lion();
        tiger.makeSound(); 
        lion.makeSound();  
        System.out.println("Kushal CSE24333 CSE-C");
    }
}
