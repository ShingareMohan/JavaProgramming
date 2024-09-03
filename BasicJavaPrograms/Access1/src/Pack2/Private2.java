package Pack2;
import Pack1.Private1;
//different package subclass
public class Private2 extends Private1 {
    public static void main(String[] args){
       Private2 p3 = new Private2();
      // p3.show();//(cannot access int different package subclass )
    }
}

//different package non-subclass
class efg1{
    public static void main(String[] args){
       Private1 q1 = new Private1();
      // q1.show();//(cannot access in different package non-subclass)

    }

    }