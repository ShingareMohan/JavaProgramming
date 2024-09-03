package DownPackage1;

public class Down1 {
    public void show(int a){
        System.out.println("Parent show method");
    }
}
class Child extends Down1{

    public void Show(int a){
        System.out.println("child test method");

    }
}
class Test17{
    public static void main(String[] args){
      Down1 Parent = new Child();
      Parent.show(1);
    }
}