package Pack1;
//same class
public class Private1 {
    private void show(){
        System.out.println("Private method");
    }
    public static void main(String[] args){
        Private1 p1 = new Private1();
        p1.show();
    }
}

class uvw extends Private1{
    public static void main(String[] args){
    uvw u1 = new uvw();
    //u1.show();(cannot access in same package subclass)
    }
    }

class akkj{
    public static void main(String[] args){
        Private1 s1 = new Private1();
        //s1.show();//(cannot access in same package non-subclass)
    }

    }