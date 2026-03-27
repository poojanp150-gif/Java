class Math{
    int add(int a,int b){
        return a + b;
    }
    int add(int a,int b , int c){
        return a + b + c;
    }
}

class Math_Polymorphism extends Math{
    public static void main(String[] args){
        Math_Polymorphism m1=new Math_Polymorphism();

        System.out.println(m1.add(2,3));
        System.out.println(m1.add(2,3,4));
    } 
}