package ConstructorPack;

public class Const1 {
    int a;
    int name;
    public Const1(){
        System.out.println("This is default constructor");
    }

}
class Test{
    public static void main(String[] args){
        Const1 c1 = new Const1();
        System.out.println("value of a "+c1.a);
       // System.out.println("value of a "+c1.name);
    }
}