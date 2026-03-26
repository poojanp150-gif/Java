// 6. JavaBean Class
// 👉 Create a JavaBean class Employee with:
// ● private variables id, name
// ● getter and setter methods

class Employee6{
    
    // Private variables (encapsulation)
    private int id;
    private String name;

    // Getter for id
    public int getId(){
        return id;  // return the value of private variable id
    }

    // Setter for id
    public void setId(int st_id){
        this.id = st_id;  // set the private variable id
    }

    // Getter for name
    public String getName(){
        return name;  // return the value of private variable name
    }

    // Setter for name
    public void setName(String st_name){
        this.name = st_name;  // set the private variable name
    }

    // Main method to test the JavaBean
    public static void main(String[] args){
        Employee6 obj = new Employee6();  // create object

        obj.setId(15);       // set id using setter
        obj.setName("poojan"); // set name using setter

        System.out.println(obj.getId());   // get id using getter
        System.out.print(obj.getName());   // get name using getter
    }

}