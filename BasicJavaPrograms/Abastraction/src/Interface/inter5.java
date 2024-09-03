package Interface;
interface TestH{
    void play();
}
interface TestI{
    void climb();
}
interface TestJ{
    void write();
}
public class inter5 implements TestH,TestI,TestJ {
    @Override
    public void play() {
        System.out.println("play method executed");

    }

    @Override
    public void climb() {
        System.out.println("climb method executed");

    }

    @Override
    public void write() {
        System.out.println("write method executed");

    }
}
class test6{
    public static void main(String[] args){
        inter5 i5 = new inter5();
        i5.play();
        i5.climb();
        i5.write();
    }

    }