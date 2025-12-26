//count the number of digits for a given number n
package Statements;
import java.util.Scanner;


public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want count in digit = ");
        int n = sc.nextInt();
        int numOfDigits = 0;
        int original_n = n;
        while(n>0){
            n = n /10 ;
            numOfDigits++;  //numOfDigits =

        }
        System.out.println("number of digits is   = " +numOfDigits);
    }
}
