// 11. Abstract Class
// 👉 Create an abstract class Animal with method sound().
// Create subclass Dog and implement it.

// Abstract class
abstract class Animal {
    // Abstract method: no body, must be implemented by subclass
    abstract void sound();
}

// Subclass that extends abstract class
class Dog extends Animal {
    // Implement abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Class to test the abstract class
class Abstract11 {
    public static void main(String[] args) {
        Dog d1 = new Dog();  // Create object of subclass
        d1.sound();           // Call implemented method
    }
}