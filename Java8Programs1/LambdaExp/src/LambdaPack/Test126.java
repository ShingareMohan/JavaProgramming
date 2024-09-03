package LambdaPack;
interface show{
    void display3(int a, String j);
}
public class Test126 {
    public static void main(String[] args){
        show s9 = (int a, String j)->{
          System.out.println("Value of a is "+a);
            System.out.println("Value of j is "+j);

        };
        s9.display3(4,"Fun programming");
    }
}
