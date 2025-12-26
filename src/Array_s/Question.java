//find the last occurrences of an element x in a given array.
//if arr[ 5,6,5,3,5,7] find how many times x repeat and which index and last occurencess
package Array_s;

import java.util.Scanner;

public class Question {

    static int lastOccur(int[] arr, int x) {
        int lastIndex = -1;
          for(int i = 0;i<arr.length;i++){
                if (arr[i] == x) {
                   lastIndex = i;
                 }
            }
       return lastIndex;
    }

     static int countOccurrances(int[] arr , int x){
       int count =0;
          for (int i =0;i<arr.length ; i++){
              if(arr[i]==x){
              count++;
               }
          }
        return count;
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

        System.out.println("enter x = ");
        int x = sc.nextInt();

       // System.out.println("count of x " + countOccurrances(arr,x) );
        System.out.println("last occurance  of x = " + lastOccur(arr,x) +" index");

    }
}
