package LambdaPack;

public interface Test122 {
    int multiply(int s, int t);

}

class S21{
    public static void main(String[] args) {
        Test122 q = (c,d)->{System.out.println("Mulitply is "+(c*d));
          int m = c*d;
          return m;

        };
     q.multiply(2,8);
    }
    }
