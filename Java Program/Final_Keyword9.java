// 9. Final Keyword
// 👉 Create a class with a final variable and try changing it. Observe error.


class FinalKeyword9{

    final int n = 5; // Final variable: value cannot be changed after initialization

    public static void main(String[] args){
        // Create object
        FinalKeyword9 obj = new FinalKeyword9();

        // Trying to change final variable will cause error
        // obj.n = 7;  // Error: cannot assign a value to final variable n

        // Print final variable
        System.out.println(obj.n);
    }
}


// | Point   | enum                      | final                     |
// | ------- | ------------------------- | ------------------------- |
// | Type    | Data type                 | Keyword                   |
// | Purpose | Fixed set of constants    | Value constant બનાવવું    |
// | Example | Monday, Tuesday           | int a = 10                |
// | Change  | value change નથી કરી શકતા | value change નથી કરી શકતા |
