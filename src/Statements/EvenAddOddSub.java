//find the sum of the following if enen come then add and if odd number come then subtract
package Statements;
import java.util.Scanner;


public class EvenAddOddSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =0;
        for(int i=1; i<=n;i++){
            if(i%2==0){
                ans -= i; //n=5 1-2 + 3-4 + 5

            }
            else{
              ans += i;  //n=7 1-2 + 3-4 + 5-6 +7
            }
        }
        System.out.println(ans);
    }
}
