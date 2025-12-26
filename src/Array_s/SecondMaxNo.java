//find the second largest number
package Array_s;
import java.util.Arrays;

import java.util.Scanner;

public class SecondMaxNo {
    static int findMax(int [] arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }

        return mx;
    }

    static int findSecondMax(int[] arr){
        int mx= findMax(arr);
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i] ==mx){
                arr[i] =Integer.MIN_VALUE;
            }
        }
        int secondMax =findMax(arr);
        return secondMax;

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

        //System.out.println(pairSum(arr , target)+" pair of element these sum is " + target);
        // 156, 453 =12

        System.out.println("Second maximum element : "+findSecondMax(arr));
    }
}
