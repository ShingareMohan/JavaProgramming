package AbsRules;

abstract class Test5 {
    abstract void show3();
}
abstract class A33 extends Test5{
    abstract void show4();
}
abstract class A44 extends A33{
    void show3(){
        System.out.println("Implimention of show3 method");

    }
    void show4(){
        System.out.println("Implimention of show4 method");

    }

}