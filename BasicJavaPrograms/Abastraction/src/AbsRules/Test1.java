package AbsRules;

abstract class Test1 {
   abstract void go();

    }
abstract class abc extends Test1{
    void go(){
        System.out.println("Implimentation of go method");
    }
    abstract void show();
}

 abstract class xyz extends abc{


 }