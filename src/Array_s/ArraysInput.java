//take a input from arrays
package Array_s;
import java.util.Scanner;

public class ArraysInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of element = ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+ n +" elements : ");
        for(int i =0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i< n;i++){
            System.out.print( arr[i] + " ");


        }
    }
}
