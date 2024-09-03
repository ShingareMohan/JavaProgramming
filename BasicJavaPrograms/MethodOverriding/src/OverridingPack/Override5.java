package OverridingPack;

public class Override5 {
    private void go(int c, int d){
        System.out.println("Parent class method executed");
    }
}
class Three extends Override5{
    protected void go(int c, int d){
        System.out.println("Child class method executed");
    }
}
class Test17{
    public static void main(String[] args){
        Three t3 = new Three();
        t3.go(3,8);
    }

    }
