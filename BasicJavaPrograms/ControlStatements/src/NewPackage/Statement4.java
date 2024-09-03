package NewPackage;

public class Statement4 {
    void test1(){
        int year = 2024;
        if(year%4==0){
            System.out.println("year is leap year");
        }
        else{
            System.out.println("year is not leap year");
        }

    }
    public static void main (String[] args){
        Statement4 t4 = new Statement4();
        t4.test1();
    }
}
