//print the first multiple of 5 which is also a multiple of 7
package Statements;
import java.util.Scanner;
public class multipleOf5and7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =1;
        while(true){
            if((num%5==0) && (num%7==0) ){
                System.out.println("found ans "+num);
                break;
            }
            num++;
        }
    }
}
