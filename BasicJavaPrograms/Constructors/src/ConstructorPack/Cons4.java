package ConstructorPack;

public class Cons4 {
    public Cons4(){
        System.out.println("Cons4 method exucuted");
    }
   public Cons4(int a, String name){
       System.out.println("Parameterized constructor executed");
   }
   public void run(){
       System.out.println("Simple method executed");
   }
}
class show{
    public static void main(String[] args) {
        Cons4 p1 = new Cons4(22,"java");
        p1.run();
    }
    }