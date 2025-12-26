//Reverse the digits of a number
 package Statements;
 import java.util.Scanner;
public class reversedigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the digits = ");
        int n = sc.nextInt();
        int ans = 0;
        int original_n =n;
        while(n>0){
           ans = ans *10 + n % 10;
           n /=10;

        }
        System.out.println("reverse digits "+original_n+ " is = "+ ans);

    }
}
