package Pack2;
import Pack1.Public1;
//Different package Subclass
public class Public2 extends Public1 {
    public static void main(String[] args) {
        Public2 t2 = new Public2();
    }
    }
//Different package Non-subclass
class xyz{
    public static void main(String[] args) {
        Public1 e1 = new Public1();
    }
    }