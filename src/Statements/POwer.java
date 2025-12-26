//given 2 numbers a and b , find a raise to the power b.
package Statements;
import java.util.Scanner;


public class POwer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans =1;
        for(int i=1; i<=b;i++){
            ans *=a; //ans=ans*a;

        }
        System.out.println(ans);

    }
}
