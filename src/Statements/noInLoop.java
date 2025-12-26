package Statements;
import java.util.Scanner;
public class noInLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how much number u print = ");
      int n =sc.nextInt();
        for(int num=1; num<=n ; num++){
            System.out.println(num);
        }
    }
}
