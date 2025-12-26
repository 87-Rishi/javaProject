//print the sum of the Strem of integers in the input
package Statements;
import java.util.Scanner;

public class doWhile100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print number= ");
        int num = sc.nextInt();
        int sum=0;

        do{
            sum +=num;
            num=sc.nextInt();

        }while(num != -1);

//      while(num != -1){
//        ;sum +=num;
//        num = sc.nextInt();
//    }
        System.out.println(sum);
}
}