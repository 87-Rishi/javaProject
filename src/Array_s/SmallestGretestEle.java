package Array_s;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestGretestEle {
    static int[] smallestAndLargestElement(int[] arr){
    Arrays.sort(arr);
    int[] ans={arr[0] , arr[arr.length - 1]};

    return ans;
    }

    static  boolean isSorted(int[] arr){
        boolean check =true;
        for(int i=1; i<arr.length;i++){
            //i=0
            //arr[0]<arr[-1]
            if(arr[i]<arr[i-1]){
                //not sorted
                check = false;
                break;
            }
        }
        return check;
    }

    static int GreaterOccurrance(int[] arr, int x) {
        int lastIndex = -1;
        System.out.println("no greater elemrnts");
        for(int i = 0;i<arr.length;i++){
            if (arr[i] > x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    static int countOccurrances(int[] arr , int x){
        int count =0;
        for (int i =0;i<arr.length ; i++){
            if(arr[i]>x){
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

//        System.out.println("enter x = ");
//        int x = sc.nextInt();

        // System.out.println("count of x " + countOccurrances(arr,x) );
        // System.out.println("there are  " + GreaterOccurrance(arr,x) +" Greagter Elements");
        //System.out.println("Is Sorted : "+isSorted(arr));
      int[] ans=  smallestAndLargestElement(arr);
        System.out.println("Smallest = "+ans[0]);
        System.out.println("largest =" + ans[1]);
    }
}
