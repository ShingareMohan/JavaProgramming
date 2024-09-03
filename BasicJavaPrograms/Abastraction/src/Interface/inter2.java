package Interface;
interface TestB{
    void go();
}
interface TestC{
    void go1();
}
public class inter2 implements TestB, TestC{

    @Override
    public void go() {
        System.out.println("go method executed");
    }

    @Override
    public void go1() {
        System.out.println("go1 method executed");

    }
}
class test2{
    public static void main(String[] args){
        inter2 i2 = new inter2();
        i2.go();
        i2.go1();
    }
}
