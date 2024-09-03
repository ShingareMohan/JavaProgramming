package DownPackage1;

public class ParentP {
    void display(){
        System.out.println("Parent class method");
    }
}
class child1 extends ParentP{
    @Override
    protected void display(){
        System.out.println("child class method");
    }
}
class Test46{
    public static void main(String[] args){
        ParentP c1 = new child1();
        c1.display();
    }
}