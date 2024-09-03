package AbsRules;

abstract class Test9 {
    abstract void follow();

}
abstract class s11 extends Test9{
    @Override
    void follow() {
        System.out.println("Follow the instruction");
    }
}