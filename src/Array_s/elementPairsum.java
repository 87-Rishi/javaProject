//find the total number of pair in the arrays whose sum is equal to the given value x
package Array_s;
import java.util.Arrays;
import java.util.Scanner;

public class elementPairsum {
    static int pairSum(int[] arr , int target){
        int n = arr.length;
        int ans=0;
        for(int i=0;i<n;i++){    //first number
            for(int j=i+1;j<n;j++){       //second number
                if(arr[i] +arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array = ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter "+ n +" elements : ");
        for(int i =0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("enter of sum : ");
        int target = sc.nextInt();

        System.out.println(pairSum(arr , target)+" pair of element these sum is " + target);
    }
}
