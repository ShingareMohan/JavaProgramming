package AbsRules1;

abstract class Rule4 {
    abstract void go();
}
class y11 extends Rule4{

    @Override
    void go() {
        System.out.println("Go to school");
    }
}
class test3{
    public static void main(String[] args){
        y11 k1 = new y11();
        k1.go();
    }
}