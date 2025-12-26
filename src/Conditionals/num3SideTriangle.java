//take 3 number input and tell if they can be the sides of a triangle.
package Conditionals;
import java.util.Scanner;

public class num3SideTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter triangle first side = ");
        int a=sc.nextInt();
        System.out.println("enter triangle second side = ");
        int b=sc.nextInt();
        System.out.println("enter triangle third side = ");
        int c=sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("valid traingle");
        }
        else {
            System.out.println("invalid triangle");
        }


    }
}
