package Interface;
interface TestA{
    public void show();
    public void display();
}
public class inter1 implements TestA  {

    @Override
    public void show() {
        System.out.println("Show method executed");
    }

    @Override
    public void display() {
        System.out.println("display method executed");

    }
}
class test{
public static void main(String[] args) {
    inter1 i = new inter1();
    i.show();
    i.display();
}
}