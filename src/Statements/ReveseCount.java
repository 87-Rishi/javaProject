//print 1 to 10 in reverse order
package Statements;
import java.util.Scanner;

public class ReveseCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number = ");
        int n = sc.nextInt();

        for(int num=n ; num>=1 ; num--){ //num--2, num=num-2
            System.out.println("reverse count = "+num);
        }
    }
}
