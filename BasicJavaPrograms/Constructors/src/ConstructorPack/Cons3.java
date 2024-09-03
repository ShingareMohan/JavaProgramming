package ConstructorPack;

public class Cons3 {
    int a;
    long name;
    double ss;
    public Cons3(){
        System.out.println("we need constructor for object creation");
    }
}
class display1{
  public static void main(String[] args){
      Cons3 j1 = new Cons3();
      System.out.println("value of variable a is"+ j1.a);
      System.out.println("value of variable name is"+ j1.name);
      System.out.println("value of variable ss is"+ j1.ss);


  }
}