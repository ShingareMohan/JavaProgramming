public class ControlStatement2 {
    boolean test3(){
        int a = 1000;
        boolean t = a>=100;

        if(t){
            System.out.println("Test message");
        }
     return true;
    }
    public static void main (String[] args){
        ControlStatement2 t5 = new ControlStatement2();
        t5.test3();
    }
}
