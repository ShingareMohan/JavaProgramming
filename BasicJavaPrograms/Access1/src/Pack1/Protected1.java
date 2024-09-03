package Pack1;
//Same class
public class Protected1 {
    protected int a = 10;
    void go(){
        System.out.println("Go method executed");
    }
    public static void main(String[] args){
        Protected1 p1 = new Protected1();
       System.out.println(p1.a) ;
    }


}
//Same package subclass
class pqrs extends Protected1{
    public static void main(String[] args){
        pqrs e1 = new pqrs();
        System.out.println(e1.a) ;

    }
}
//Same Package Non-subclass
class ss{
    public static void main(String[] args){
        Protected1 u1 = new Protected1();
        System.out.println(u1.a) ;

    }
    }
