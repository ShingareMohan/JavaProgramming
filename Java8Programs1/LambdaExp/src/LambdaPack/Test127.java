package LambdaPack;
interface show1{
    void display4(float d, double p);
}
public class Test127 {
    public static void main(String[] args){
        show1 w1 = (float d, double p)-> {
            System.out.println("value of d " + d);
            System.out.println("value of p " + p);

        };
        w1.display4(2.3f,7463773);
    }
}
