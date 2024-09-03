package Ladder;
import java.util.Scanner;
public class Test5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature");
        int temperature = input.nextInt();

        if(temperature<0){
         System.out.println("Very cold weather");
        }
        else if(temperature>0 && temperature<=20){
            System.out.println("cold weather");
        }
        else if (temperature>20 && temperature<=40){
            System.out.println("Normal temperature");
        }
        else{
            System.out.println("High temperature");
        }
    }
}
