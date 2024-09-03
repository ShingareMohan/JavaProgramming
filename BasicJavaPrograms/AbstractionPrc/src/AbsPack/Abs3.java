package AbsPack;

abstract class Abs3 {
    abstract void show1();

    void go(){
        System.out.println("Non-abstract method");
    }
}
abstract class C extends Abs3{
    void show1(){
        System.out.println("Abstract methid");
    }
}

class Test29{
    public static void main(String[] args){
       // C c1 = new C();
    }
}