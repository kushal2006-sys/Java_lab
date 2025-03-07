class MyClass {

static int count = 0;

final double pi = 3.14;

public MyClass() {

count++;

}

public static void main(String[] args) {

MyClass object1 = new MyClass();

MyClass object2 = new MyClass();

MyClass object3 = new MyClass();

System.out.println("Final count of objects created: " + count);

System.out.println("Value of pi: " + object1.pi); // Pi is constant, and we can access it via any object

}

}