package CPack1;

public class Cons1 {
     public Cons1(){
         this(30);
         System.out.println("parameterless Constructor of Cons1 executed");
     }
     public Cons1(int s){

         System.out.println("parameterized Constructor of Cons1 executed");

     }
}
class abc extends Cons1{
    public abc(){
        this(10);
      System.out.println("Parameterless constructor of abc executed");
    }
    public abc(int a){
        super();

        System.out.println("Parameterizaed constructor of abc executed");
    }
}
class test4{
    public static void main(String[] args){
        abc a1 = new abc();
         // Cons1 c1 = new Cons1(10);
    }
}