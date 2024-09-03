package ConstructorChaining;

public class Chain2 {
    public Chain2(){
        System.out.println("Parameterless constructor");
    }
}
class ktjr extends Chain2{
    public ktjr (int a){
        System.out.println("Parameterized constructor");
    }
}
class jlsk extends ktjr{
    public jlsk(){
        super(1);
        System.out.println("constructor of child class");

    }
}
class review1{
    public static void main(String[] args) {
        jlsk a1 = new jlsk();
    }

    }