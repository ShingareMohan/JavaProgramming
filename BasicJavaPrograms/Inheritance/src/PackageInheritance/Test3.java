package PackageInheritance;

public class Test3 {
    void show1(){
        int p = 4;
        int q = 5;
        int miltiply = p * q;
        System.out.println("multiplication of 4 & 5 is "+miltiply);
    }
}
class show2 extends Test3{
    public static void main (String[] args){
        show2 sl = new show2();
        sl.show1();
    }
}
