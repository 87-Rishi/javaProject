package Method;
import java.util.Scanner;
class Meth1{
    int add(int a,int b){
        int ans = a+b;
        return ans;
    }

}
public class SumTwoNUmber {
    public static void main(String[] args) {
        Meth1 obj = new Meth1();
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();

        System.out.print("sum of input number is = ");
         int ans=obj.add(a,b);
        System.out.println(ans);
    }
}
