package AbsRules;

abstract class Test8 {
    abstract void write();
}
abstract class p11 extends Test8{
    abstract void run();
}
 class p22 extends p11{
    @Override
    void write() {
        System.out.println("Write a letter");
    }

    @Override
    void run() {
        System.out.println("jump from the wall");

    }
}
class test{
    public static void main(String[] args){
        p22 t = new p22();
        t.run();
        t.write();
    }
}