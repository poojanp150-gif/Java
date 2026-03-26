// 8. Static Keyword
// 👉 Create a class with a static variable count.
// Increment it using multiple objects.


class StaticKeyword8{

    static int count;  // Static variable shared by all objects

    // Constructor
    StaticKeyword8(){
        count++;  // Increment static variable whenever a new object is created
    }

    // Method to display value of count
    void Display(){
        System.out.println(count);
    }

    public static void main(String[] args){
        // Create first object
        StaticKeyword8 obj1 = new StaticKeyword8();
        obj1.Display();  // count = 1

        // Create second object
        StaticKeyword8 obj2 = new StaticKeyword8();
        obj2.Display();  // count = 2 (shared)

        // Create third object
        StaticKeyword8 obj3 = new StaticKeyword8();
        obj3.Display();  // count = 3 (shared)
    }
}

// output:
// 1
// 2
// 3