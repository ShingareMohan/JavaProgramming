package PackageInheritance;

public class leapYear {
    int year = 2024;
    void check(){
       if(year%4==0){
           System.out.println("Year is leap year");
       }
       else{
           System.out.println("Year is not a leap year");

       }
    }
}
class test{
    public static void main(String[] args){
        leapYear c1 = new leapYear();
        c1.check();
    }
}
