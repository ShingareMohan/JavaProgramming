package OverridingPack;

public class Override2 {
    protected void go(){
        System.out.println("Go method of parent class executed");
    }
}
class pqr extends Override2{
   protected void go(){
       System.out.println("Go method of child class executed");

   }
}
class Test13{
    public static void main(String[] args){
        pqr p1 = new pqr();
        p1.go();
    }
}