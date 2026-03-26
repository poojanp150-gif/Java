// 12. Interface Implementation
// 👉 Create an interface Shape with method draw().
// Implement it in class Circle.

 
interface Shape{ // Shape is an interface → it contains only abstract methods
    // Abstract method: no body, must be implemented by class
        void draw();
}
// Class Circle implements Shape interface
class Circle implements Shape {
    // Implement the draw() method
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Class to test interface
class Interface12 {
    public static void main(String[] args) {
        Circle c1 = new Circle();  // Create object of Circle
        c1.draw();                 // Call the implemented method
    }
}