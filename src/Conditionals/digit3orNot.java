//take positive interger input and tell if it is a three digit number or not.
package Conditionals;
import java.util.Scanner;
public class digit3orNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number = ");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println(n + "is three digit number");


        }
        else {
            System.out.println("it is not three digit number");
        }

    }
}
