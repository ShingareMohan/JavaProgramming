package OverridingPack;

public class Override3 {
    int m;
    private int display(int a, int b){
System.out.println("Multiplication is "+m);
     return (a * b);
    }
}
class One extends Override{
    int m;
    int display(int a, int b ){
        m=a/b;
        System.out.println("Division is "+m);
     return m;
    }
}
class Test14{
    public static void main(String[] args){
      One o1 = new One();
      o1.display(4,2);
    }
}