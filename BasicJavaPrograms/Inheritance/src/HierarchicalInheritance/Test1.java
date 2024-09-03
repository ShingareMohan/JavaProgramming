package HierarchicalInheritance;

public class Test1 {

}
class A{
    void print_A(){
        System.out.println("Class A");
    }
}
class B extends A{
    void print_B(){
        System.out.println("Class B");
    }
}
class C extends A{
    void print_C(){
        System.out.println("Class C");
    }
}
class D extends A{
    void print_D(){
        System.out.println("Class D");
    }
}
class test{
    public static void main (String[] args){
        B b1 = new B();
        b1.print_A();
        b1.print_B();

        C c1 = new C();
        c1.print_A();
        c1.print_C();

        D d1 = new D();
        d1.print_A();
        d1.print_D();
    }
}