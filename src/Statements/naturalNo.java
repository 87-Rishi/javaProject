//print the sum of the first n natural numbers , where n is the input
package Statements;
import java.util.Scanner;

public class naturalNo {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number = ");
     int n = sc.nextInt();
     int num = 1;
     int sum = 0;
     while(num <= n){
         System.out.println(num);
         num = num+1 ; //increment operator ++
     }
    }
}
