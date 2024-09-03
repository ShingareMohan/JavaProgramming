package PackageInheritance;
import java.util.Scanner;
public class newleap {
    public static void main(String[] args){
        int year;
        System.out.println("enter year to be checked");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if(year%4==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");

        }
        }
    }

