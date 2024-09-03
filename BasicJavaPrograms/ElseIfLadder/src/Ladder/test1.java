package Ladder;
import java.util.Scanner;
public class test1 {
    public static void main(String[] args){
      Scanner in  = new Scanner(System.in);
      System.out.print("Enter number");
      int input = in.nextInt();
      if(input > 0){
          System.out.println("number is positive");
          }
      else if(input < 0) {

          System.out.println("number is negative");
      }
      else{
          System.out.println("number is equal to zero");
      }
    }
}
