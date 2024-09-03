package LambdaPack;
interface R1{
    void display(int a, String p);
}
public class Test124 {
    public static void main(String[] args){
        R1 r = (int a, String p)->{System.out.println("Value of a is "+a);
            System.out.println("Value of p is "+p);
        };
        r.display(2,"java");
    }
}
