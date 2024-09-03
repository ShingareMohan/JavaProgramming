package LambdaPack;
interface O1{
    void display6(String s, String i);
}
public class Tset129 {
    public static void main(String[] args){
        O1 r = (String s, String i)->{
            System.out.println("Value of s "+s);
            System.out.println("Value of i "+i);
        };
        r.display6("Java","Programming");
    }
}
