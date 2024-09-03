package Interface;
interface TestD{
    void watch();
}
interface TestE{
    void view();
}
public class inter3 implements TestD, TestE {

    @Override
    public void watch() {
        System.out.println("watch method executed");
    }

    @Override
    public void view() {
        System.out.println("view method executed");
    }
}
class test4{
    public static void main(String[] args){
        inter3 i3 = new inter3();
        i3.view();
        i3.view();
    }
}