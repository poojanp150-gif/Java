// 5. Variable Types
// 👉 Write a program showing:
// ● instance variable
// ● static variable
// ● local variable

class VariableTypes5{
    int instance_a=10;
    static int static_b=20;
    
    void Display(){
        int local_c=300;

        System.out.println("Local Variable" + local_c);
    }

    public static void main(String[] args){
        VariableTypes5 obj1 = new VariableTypes5(); 
        VariableTypes5 obj2 = new VariableTypes5(); 

        obj2.instance_a=50;
        obj2.static_b=100;

        System.out.println("Instance Variable:" + obj1.instance_a );
        System.out.println("Instance Variable:" + obj2.instance_a );

        System.out.println("Static Variable:" + obj1.static_b);
        System.out.println("Static Variable:" + obj2.static_b);

         obj1.Display();
    }
}

// output:
// Instance Variable:10
// Instance Variable:50
// Static Variable:100
// Static Variable:100
// Local Variable300