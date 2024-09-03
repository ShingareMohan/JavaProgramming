package NewPackage;

public class CStatement {
    void Show(){
        int a = 100;
        if(a>0){
            System.out.println("Number is positive integer");

        }
    }
    public static void main (String[] args){
        CStatement c1 = new CStatement();
        c1.Show();
    }
}
