//take 3 positive integers input and print the greter of them
package Conditionals;
import java.util.Scanner;


public class In3numfindGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number= ");
        int n1=sc.nextInt();
        System.out.println("enter second number= ");
        int n2=sc.nextInt();
        System.out.println("enter third number= ");
        int n3=sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1 + " is greater number ");
        }
        else if (n2>n3 && n2>n1) {
            System.out.println(n2 + " is grater number");
        }
        else{
            System.out.println(n3 +" is greater number");
        }

    }
}
