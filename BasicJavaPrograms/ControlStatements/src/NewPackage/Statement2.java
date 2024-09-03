package NewPackage;

public class Statement2 {
    void test() {
        int b = 12;
        if (b >= 100) {
            System.out.println("number is greater than 100");
        } else {
            System.out.println("number is less then 100");
        }
    }
    public static void main (String[] args){
        Statement2 t2 = new Statement2();
        t2.test();
    }
}
