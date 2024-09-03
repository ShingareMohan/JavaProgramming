package Pack1;
//Same class
public class Public1 {
   public void display2(){
        System.out.println("Display2 method executed");
    }
    public static void main(String[] args){
        Public1 g1 = new Public1();
        g1.display2();
    }
}

//Same package subclass
class a1 extends Public1{
    public static void main(String[] args) {
        a1 e1 = new a1();
    }
}

//Same Package Non-Subclass
class view{
    public static void main(String[] args){
     Public1 j1 = new Public1();
    }
    }