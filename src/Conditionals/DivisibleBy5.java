//take positive integer input and tell if it is divisible by 5 or not.
package Conditionals;
import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number =");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("you enter number is divisible by 5");
        }
        else
        {
           System.out.println("you enter number is not divisible by 5");
        }
    }
}
