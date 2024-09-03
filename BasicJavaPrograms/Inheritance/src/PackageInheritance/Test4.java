package PackageInheritance;

public class Test4 {
    void division(){
        int s = 10;
        int r = 5;
         int divide = s/r;
         System.out.println("Division of s & r is "+divide);
    }
}
class abc extends Test4{
    public static void main (String[] args){
        abc a1 = new abc();
        a1.division();
    }
}
