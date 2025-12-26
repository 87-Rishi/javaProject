package Method;

public class demo {
    int a;
    String s;
    public demo(){
        this.a=10;
        this.s="java";
    }
    public demo(int a, String s){
        this.a=a;
        this.s=s;
    }
    public demo( String s,int a){
        this.s=s;
        this.a=a;
    }
    public demo(int a){
        this.a=a;
    }
    public demo( String s){
        this.s=s;
    }
    public void demo(){
        System.out.println("A :"+ a +" S :"+s);
    }
    public static void main(String[] args){
        demo obj = new demo();
        demo obj1 = new demo(24,"vidya");
        demo obj2 = new demo("gupta",27);
        demo obj3 = new demo(44);
        demo obj4 = new demo("gola");
        obj.demo();
        obj1.demo();
        obj2.demo();
        obj3.demo();
        obj4.demo();
    }

}
