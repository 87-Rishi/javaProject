//any year is input through the keyword . write a program to determine whether the year is a leap year or not.(Considering leap year occurs after every 4 years)
package Conditionals;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a year:");
     int year = sc.nextInt();
     boolean isLeapYear;
     //divisible by 4
     isLeapYear=(year%4==0);
     //divisible by 4 , not by 100, or divisible by 400
        isLeapYear =isLeapYear && (year % 100 != 0 || year % 400 == 0);
        if(isLeapYear)
        {
            System.out.println(year + "is a leap year");
        }
        else
        {
            System.out.println(year + "is not leap year");
        }


    }
}
