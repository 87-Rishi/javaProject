// if cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss. also determine how much profit he made or loss he incuured.

package Conditionals;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price = ");
        int cp = sc.nextInt();
        System.out.println("enter the selling price = ");
        int sp = sc.nextInt();
        if(sp>cp){//profit

            System.out.print("you made a profit = ");
            System.out.println(sp-cp);
        }
        if(cp>sp){ //loss
            System.out.print("you incurred a loss = ");
            System.out.println(cp-sp);
        }
    }
}
