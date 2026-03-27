class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}
 
class Dog extends Animal {
    void sound(){
        System.out.println("Dog Sound");
    }

    void DogColor(){
        System.out.println("Dog Color Black");
    }
}

class Animal_Reference_Variable  {
    public static void main(String[] args){

        Dog d1= new Dog();
        d1.sound();
        d1.DogColor();
    }
}