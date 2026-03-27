// Method Overriding
class Animal{
    void Sound(){
        System.out.println("Animal Sound");
    }
}

class Dog_Polymorphism extends Animal{

    void Sound(){
        System.out.println("Dog");
    }

    public static void main(String[] args){
        Dog_Polymorphism D1= new Dog_Polymorphism();
        D1.Sound();
    }
}