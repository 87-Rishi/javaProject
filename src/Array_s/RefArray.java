//arrays reference in java
package Array_s;
import java.util.Scanner;


public class RefArray {
    static void PrintArrays(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of element = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original arrays :");
        PrintArrays(arr);
        //trying to copy arr to arr2
       int[] arr_2 =  arr;   // arr.clone() cannot change if i change arr_2 using  arr.clone() we cannot change original array
        System.out.println("");//using  arr.clone() we create deep copy
        System.out.println("copied array_2 :");
      PrintArrays(arr_2);

      //changing some values of arr_2
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println(" ");
        System.out.println("original array after changing arr_2");
        PrintArrays(arr);
        System.out.println(" ");
        System.out.println("copied arr_2 after changing array_2");
        PrintArrays(arr_2);




    }
}
