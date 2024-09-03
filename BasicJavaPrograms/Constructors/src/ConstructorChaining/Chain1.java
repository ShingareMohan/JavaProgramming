package ConstructorChaining;

public class Chain1 {
    public Chain1(int a){
        System.out.println("First method of constructor chaining");
    }
}
class ght extends Chain1{
    public ght(){
        super(100);
        System.out.println("2nd method of constructor chaining");
    }
}
class review{
    public static void main(String[] args) {
        ght k1 = new ght();
    }

    }