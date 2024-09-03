package AbsPack;

abstract public class Vehicle {
    abstract void NewFeature();
    void start(){
        System.out.println("Start the car");
    }
}

abstract class Car1 extends Vehicle{
   public void NewFeature(){
       System.out.println("abstract method");
    }
}
class C1 extends Car1{
   public void show2(){
       System.out.println("Show method");
   }
}
class Test78{
    public static void main(String[] args){
        C1 a1 = new C1();
        a1.start();
        a1.NewFeature();
        a1.show2();
    }
}