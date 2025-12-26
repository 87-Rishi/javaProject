// take interger input and print the absolute value of that integer
package Conditionals;
import java.util.Scanner;

public class NegativeToP {
    public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
       System.out.println("enter a number=");
       int n = sc.nextInt();
       if(n>=0)
       {
           System.out.println("number is absolute = "+ n);
       }
       if(n<=0)
       {
           n = n*(-1);
           System.out.println("number you entered is negative but now it is positive = " + n);
       }
    }
}
