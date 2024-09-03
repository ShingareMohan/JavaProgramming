package AbsRules1;

abstract class Rule1 {
    abstract void call();
    abstract void show();

}
class q11 extends Rule1{

    @Override
    void call() {
        System.out.println("Make call");
    }

    @Override
    void show() {
        System.out.println("Show method executed");

    }
}
class test{
    public static void main(String[] args){
        q11 g1 = new q11();
        g1.call();
        g1.show();
    }
}