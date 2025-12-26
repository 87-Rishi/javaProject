//take positive integer input and tell if it is divisible by 5 and 3.
package Conditionals;
import java.util.Scanner;

public class DivisBy5or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number= ");
        int n = sc.nextInt();
        if (n%5==0 && n%3==0) {
            System.out.println(n+" is divisible by both 3 and 5");
        }
        else if(n%3==0){
            System.out.println(n+" is divisible by 3");
        }
        else if (n%5==0) {
            System.out.println(n +" is divisible by 5");


        }  else {
            System.out.println( n +" it is not divisible by 3 and 5 ");
        }
    }
}
