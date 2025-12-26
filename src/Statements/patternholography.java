package Statements;
import java.util.Scanner;

public class patternholography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++ ){
            //print r-1 spaces
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            //print 1 to i
            for(int k=1; k<=2*i-1; k++){
                if(k==1 || k==2*i-1 || i==r ){
                    System.out.print(k);
                }
                else {
                    System.out.print(" ");
                }
                System.out.println( );

            }
        }
    }
}
