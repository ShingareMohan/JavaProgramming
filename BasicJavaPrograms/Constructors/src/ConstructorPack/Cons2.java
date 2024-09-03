package ConstructorPack;

public class Cons2 {
    public Cons2(int a, String s){
        System.out.println("Parameterised constructor executed");
    }
    public Cons2(){
        System.out.println("Parameterless constructor executed");

    }
}
class test{
    public static void main(String[] args){
        Cons2 n1 = new Cons2(20,"java");

    }
}