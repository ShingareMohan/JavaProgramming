public class statement1 {
    void show(){
        int a = 110;
        if(a>0){
            System.out.println("number is positive integer");

        }
        else{
            System.out.println("number is negative integer");
        }
    }
    public static void main (String[] args){
        statement1 t1 = new statement1();
        t1.show();
    }
}
