package LambdaPack;

public interface Test121 {
    void sub(int p, int r);
}

class S1 {
    public static void main(String[] args) {
        Test121 a = (int p, int r) -> {System.out.println("Substraction is " + (p - r));};
      a.sub(40,20);
    }
}