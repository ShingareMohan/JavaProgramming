package LambdaPack;

public interface A1 {
    void Sum(int a, int s);
}

class A2 {
    public static void main(String[] args) {
        A1 s  = (x,y) ->System.out.println("addition of two numbers is "+(x+y));
        s.Sum(20,30);
        };
    }
