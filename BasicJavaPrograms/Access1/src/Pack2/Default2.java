package Pack2;

import Pack1.Default1;
//differnt package subclass
public class Default2 extends Default1 {
    public static void main(String[] args){
        Default1 d1 = new Default1();
//d1.display();//(cannot access default method in differnt package subclass)
    }
    }

   //differnt package non subclass
class efg{
       public static void main(String[] args) {
           Default1 d2 = new Default1();
          // d2.display();//(cannot access default method in differnt package non-subclass)
       }    }