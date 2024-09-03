package MultilevelInheritance;

public class Test1 {
    void add(){
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum of 10 & 20 is "+sum);
    }
}
class c extends Test1{
    void sub(){
        int p = 4;
        int q = 2;
        int substraction = p-q;
        System.out.println("sub of 4 & 2 is "+substraction);
    }

}
class e extends c{
    void multiply(){
        int s = 4;
        int r = 5;
        int multiplication = s*r;
        System.out.println("multiplication of 4 & 5 is "+multiplication);
    }
}
class r extends e{
    void divide(){
        int x = 50;
        int y = 25;
        int division = x/y;
        System.out.println("division of 50 & 25 is "+division);
    }
    public static void main (String[] args){
        r t1 = new r();
        t1.add();
        t1.sub();
        t1.multiply();
        t1.divide();
    }
}
