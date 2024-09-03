package Pack1;

public class Default1 {
    void display(){
        System.out.println("Default method");
    }
    public static void main(String[] args){
        Default1 d1 = new Default1();
        d1.display();
    }
}
class abc extends Default1{
    public static void main(String[] args){
        abc a1 = new abc();
        a1.display();
    }
    }

 class pqr{
     public static void main(String[] args){
         Default1 k1 = new Default1();
         k1.display();
     }

     }