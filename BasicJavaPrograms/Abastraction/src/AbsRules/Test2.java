package AbsRules;

abstract class Test2 {
    abstract void display();
}
abstract class A11 extends Test2{
    abstract void display2();
}
abstract class A22 extends A11{
    void display(){
        System.out.println("Implimention of display method");
    }
    void display2(){
        System.out.println("Implimention of display2 method");

    }
}