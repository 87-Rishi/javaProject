package Method;

public class Meth {
    int a;
    double d;
    int c;

    // Default constructor
    public Meth() {
        this.a = 10;
        this.d = 40.8;
        this.c = 19;
    }

    // Constructor with int, double
    public Meth(int a, double d) {
        this.a = a;
        this.d = d;
    }

    // Constructor with double, int
    public Meth(double d, int c) {
        this.d = d;
        this.c = c;
    }

    // Constructor with int, int
    public Meth(int a, int c) {
        this.a = a;
        this.c = c;
    }

    public void meth1() {
        int a = 30;
        int c = 50;
        System.out.println("sum meth1 = " + (a + c));
    }

    public void meth2(int a, double d) {
        System.out.println("sum meth2 = " + (a + d));
    }

    public void meth3(double d, int c) {
        System.out.println("sum meth3 = " + (d + c));
    }

    public void meth4(int a, int c) {
        System.out.println("sum meth4 = " + (a + c));
    }

    public static void main(String[] args) {

        Meth obj1 = new Meth();
        Meth obj2 = new Meth(10, 16.6);
        Meth obj3 = new Meth(26.8, 16);
        Meth obj4 = new Meth(33, 66);

        obj1.meth1();
        obj2.meth2(obj2.a, obj2.d);
        obj3.meth3(obj3.d, obj3.c);
        obj4.meth4(obj4.a, obj4.c);
    }
}
