package PackageInheritance;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        int number;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if(number%2==0){
            System.out.println("number is even number");
        }

        else{
            System.out.println("number is odd number");

        }
    }
}
