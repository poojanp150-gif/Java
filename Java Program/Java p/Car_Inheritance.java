class Model{
    void Car_Model(){
        System.out.println("V8");
    }
}

class Car_Inheritance extends Model{
    void Car_Color(){
        System.out.println("Red");
    }

    public static void main(String[] args){
        Car_Inheritance  C1= new Car_Inheritance();
        C1.Car_Model();
        C1.Car_Color();
    }
}

