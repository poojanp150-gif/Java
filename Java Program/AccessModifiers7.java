// 7. Access Modifiers
// 👉 Create a class with:
// ● one private variable
// ● one public variable
// Print values using methods

class AccessModifiers7{

    private int age = 10;       // Private variable: accessible only inside class
    public String name = "Rahul"; // Public variable: accessible from anywhere

    // Method to display values
    void Display(){
        // Can access both private and public variables inside class
        System.out.println("age: " + age);
        System.out.println("name: " + name);
    }

    public static void main(String[] arg){
        // Create object
        AccessModifiers7 obj = new AccessModifiers7();

        // Call method to print variables
        obj.Display();
    }
}

// output:
// age: 10
// name: Rahul