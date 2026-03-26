
enum Day{ // special data type to represent a fixed set of constants
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
// Class to test enum
class Enum10 {
    public static void main(String[] args){
        // Create a variable of type Day and assign a value
        Day today = Day.Monday;

        // Print the enum value
        System.out.print(today);
    }
}


// | Point   | enum                      | final                     |
// | ------- | ------------------------- | ------------------------- |
// | Type    | Data type                 | Keyword                   |
// | Purpose | Fixed set of constants    | Value constant બનાવવું    |
// | Example | Monday, Tuesday           | int a = 10                |
// | Change  | value change નથી કરી શકતા | value change નથી કરી શકતા |
