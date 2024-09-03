package DownPackage1;

public class Parent {
    void show(){
        System.out.println("parent class method");
    }
}
class child extends Parent{
    @Override
    void show(){
        System.out.println("child class method");

    }
}
class Test35{
    public static void main(String[] args){
        Parent P = new child();
        P.show();
    }

    }