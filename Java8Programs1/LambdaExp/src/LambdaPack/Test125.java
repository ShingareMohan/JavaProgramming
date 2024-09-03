package LambdaPack;
interface D1{
    void display1(String a, int s);
    }

public class Test125 {
    public static void main(String[] args){
        D1 q = (String a, int s)->{System.out.println("Value of a "+a);
            System.out.println("Value of s is "+s);
        };
        q.display1("java programming",20);
    }
}
