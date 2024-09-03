package Ladder;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("input a:");
        double a = input.nextDouble();
        System.out.print("input b:");
        double b = input.nextDouble();
        System.out.print("input b:");
        double c = input.nextDouble();

        double result = b * b - 4.0 * a * c;

        if(result>0){
            double r1 = (-b + Math.pow(result,0.5))/(2.0/a);
            double r2 = (-b - Math.pow(result,0.5))/(2.0/a);
            System.out.println("The roots are real and unequal ");
        }
       else if (result==0){
            double r1 = -b/(2.0*a);
            System.out.println("The roots are real and equal ");
        }
       else{
            System.out.println("The equation has no real roots");
        }

    }
}
