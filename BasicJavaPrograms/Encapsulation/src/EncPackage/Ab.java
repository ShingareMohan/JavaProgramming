package EncPackage;

public class Ab {
    int age = 100;

    void test(){
        int abc = 25;
        System.out.println("age is"+abc);
    }

    void display(){
        System.out.println("age is"+age);
    }

}
class test23{
    public static void main(String[] args){
        Ab a1 = new Ab();
        a1.display();
       a1.age = 200;
       System.out.println("age1 is"+a1.age);
    }
}