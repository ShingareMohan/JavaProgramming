package AbsRules1;

abstract class Rule2 {
    abstract void enter();

}
class d11 extends Rule2{

    @Override
    void enter() {
System.out.println("enter method executed");
    }
}
class test1{
    public static void main(String[] args){
        d11 j1 = new d11();
        j1.enter();
    }
}