package AbsPack;

abstract class Abs2 {
   abstract void  display();

   public void diaplay1(){
       System.out.println("Non-abstract method");
   }

}
class B extends Abs2{

    @Override
    void display() {
        System.out.println("abstract method");
    }
}
class Test28{
   // Abs2 a2 = new Abs2();(Cannot create object of abstract class)
    public static void mai(String[] args){
        B b1 = new B();
        b1.display();
    }
}