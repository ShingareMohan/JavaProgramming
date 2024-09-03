package LambdaPack;
interface S34{
    void show5(int p, int e);
}
public class Test128 {
    public static void main(String[] args){
  S34 s8 = (int p, int e)->{
      System.out.println("Value of p "+p);
      System.out.println("Value of e "+e);
  };
  s8.show5(3,4);
}
    }