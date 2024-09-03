package Abs;

abstract class Test7 {
    abstract void watch();
}

class display5 extends Test7{
    void watch(){
        System.out.println("Watching movie");
    }
}

class display6 extends Test7{
    void watch(){
        System.out.println("Watching cricket");
    }
}
class pqr{
    public static void main(String[] args){
        display5 k = new display5();
        k.watch();

        display6 pp = new display6();
        pp.watch();
    }
}