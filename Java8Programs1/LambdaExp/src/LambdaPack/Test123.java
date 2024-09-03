package LambdaPack;

interface S41{
    int divide(int p, int q);
}
public class Test123 {
    public static void main(String[] args){
        S41 w = (t,y)->{System.out.println("division is "+(t/y));
            int f = t/y;
            return f;
        };
        w.divide(4,2);
    }
}



