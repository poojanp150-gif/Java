class Encapsulation{
    private String CarName;

    public void setName(String Carname){
        this.CarName=Carname;
    }

    public String getName(){
        return CarName;
    }

    public static void main(String[] args){
        Encapsulation E1 = new Encapsulation();
        E1.setName("xyz");
        System.out.print(E1.getName());
    }
}