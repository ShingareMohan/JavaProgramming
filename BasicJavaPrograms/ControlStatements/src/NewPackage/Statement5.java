package NewPackage;

public class Statement5 {
    void test2(){
        int y = 2321;
        if(y>1000){
            System.out.println("number is greater than 1000");
        }
        else{
            System.out.println("number is less than 1000");
        }
    }
    public static void main (String[] args){
        Statement5 t5 = new Statement5();
        t5.test2();
    }
}
