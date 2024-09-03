package PackageInheritance;

public class Test2 {
    void sub(){
        int x = 46;
        int y = 37;
       int substraction = x - y;
       System.out.println("substraction of two numbers is "+substraction);
    }
}
class show extends Test2{
    public static void main (String[] args){
        show ob = new show();
        ob.sub();
    }
}


