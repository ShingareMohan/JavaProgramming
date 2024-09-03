package Interface;
interface ijk{
    public void go();
}
interface hfg{
    public void go();
}
public class inter8 implements ijk,hfg {
    @Override
    public void go() {
        System.out.println("Interface1");
    }



}
class hsf{
    public static void main(String[] args){
inter8 j8 = new inter8();
j8.go();
    }

    }