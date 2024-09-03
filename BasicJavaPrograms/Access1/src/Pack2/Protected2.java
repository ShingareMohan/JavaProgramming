package Pack2;
import Pack1.Protected1;

//Different Package Subclass
public class Protected2 extends Protected1{
    public static void main(String[] args) {

        Protected2 d2 = new Protected2();
        System.out.println(d2.a);
    }
}

//Different Package Non-Subclass
class lmn {
    public static void main(String[] args) {
        Protected1 r1 = new Protected1();
       // System.out.println(r1.a);

    }
}