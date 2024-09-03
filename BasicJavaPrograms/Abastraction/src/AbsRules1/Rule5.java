package AbsRules1;

abstract class Rule5 {
abstract void share();
abstract void drive();
}
class k11 extends Rule5{

    @Override
    void share() {
        System.out.println("Share your knowledge");
    }

    @Override
    void drive() {
        System.out.println("drive your car");

    }
}
class test5{
    public static void main (String[] args){
        k11 d1 = new k11();
        d1.share();
        d1.drive();
    }
}