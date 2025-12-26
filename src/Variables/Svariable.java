package Variables;
class Algebra{
    int a=10;
    int b=5;
    int add(){
        int p=100;
        int q=20;
        return p+q;

    }
    int sub() {
        return a - b;
    }
    void demo(){
       int a=5;
       System.out.println(a);
      //  System.out.println(b);
        for(int i=1; i<5; i++)
        {
            System.out.println(i);
//            int b=10;
//            System.out.println(b);//10
        }
        for(int i=0; i<2; i++)
        {
            int b=100;
            System.out.println(b);//100
        }

    }
}
public class Svariable {
    public static void main(String[] args) {
     Algebra obj = new Algebra();
     obj.demo();
    }
}
