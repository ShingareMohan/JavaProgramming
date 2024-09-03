package abs;

public abstract class Abs1 {
    void show(){

    }
    abstract void test();


}
abstract class A {

    abstract void m1();

}
 class B extends A {

     @Override
     void m1() {
      System.out.println("Show");
     }
     void go(){
         System.out.println("Where are you");
     }
     static class C extends A{

         @Override
         void m1() {
             System.out.println("How are you");

         }
     }
 }
class Test23{
    public static void main(String[] args){
        A a = new B.C();
        a.m1();
        //a.go();
    }
}