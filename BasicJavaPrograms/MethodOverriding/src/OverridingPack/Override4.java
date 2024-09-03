package OverridingPack;

public class Override4 {
    void show1(int a){
        System.out.println("Show1 method of base class executed");
    }
}
class Two extends Override4{
   protected void show1(int a){
        System.out.println("Show1 method of child class executed");

    }
}
class Test16{
    public static void main(String[] args){
        Two t2 = new Two();
        t2.show1(2);
    }

    }