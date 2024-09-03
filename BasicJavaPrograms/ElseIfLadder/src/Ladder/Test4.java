package Ladder;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age ");
        int age = input.nextInt();
        if(age<=12){
            System.out.println("He/She is a child");
        }
        else if(age>12 && age<=18){
            System.out.println("He/She is a teenager");
        }
        else{
            System.out.println("He/She is a adult");
        }
    }
}
