//find the total number of pair in the ayyay whose sum is equal to the given value x.
package Array_s;

import java.util.Arrays;

import java.util.Scanner;

public class triplateSumElement {
    static int pairSum(int[] arr , int target){
        int n = arr.length;
        int ans=0;
        for(int i=0;i<n;i++){    //first number
            for(int j=i+1;j<n;j++){
                //second number
               for(int k=j+1; k<n;k++){ //third number
                   if(arr[i] +arr[j] +arr[k]==target){
                       ans++;
                   }
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
            arr[i]= sc.nextInt();    //input 14563
        }

        System.out.print("enter of sum : ");
        int target = sc.nextInt(); //input 12

        System.out.println(pairSum(arr , target)+" pair of element these sum is " + target);
            // 156, 453 =12
    }
}
