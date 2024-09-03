package Interface;
interface TestF{
    void see();
}
interface TestG{
    void run();
}
public class inter4 implements TestF, TestG{


    @Override
    public void see() {
        System.out.println("see method executed");

    }

    @Override
    public void run() {
        System.out.println("run method executed");

    }
}
class test5{
    public static void main(String[] args){
        inter4 i4 = new inter4();
        i4.run();
        i4.see();
    }

    }