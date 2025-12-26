//given the length and breadth of a rectangle write a program to find whether the area of the rectangle is grater than its perimeter.
package Conditionals;
import java.util.Scanner;

public class AreaRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of rectangle = ");
        int l = sc.nextInt();
        System.out.println("enter the width of rectangle = ");
        int b = sc.nextInt();
        float area;
        area = l*b;
        int perimeter =2*(l+b);
        if(area>perimeter){
            System.out.println("area is grater than perimeter");
        }
        if(perimeter>area) {
            System.out.println("perimeter is grater than area");
        }
        if(perimeter==area){
            System.out.println("perimeter is equal to area");
        }

    }
}
