package HierarchicalInheritance;

public class Test2 {

}
class X{
  void print_X(){
      System.out.println("Shingare");
    }
}
class Y extends X{
    void print_Y(){
        System.out.println("Manoj");
    }
}
class Z extends X{
    void print_Z(){
        System.out.println("Mayuri");
    }
}
class M extends X{
    void print_M(){
        System.out.println("Mohan");
    }
}
class abc{
    public static void main (String[] args){
        Y y1 = new Y();
        y1.print_Y();
        y1.print_X();

        Z z1 = new Z();
        z1.print_Z();
        z1.print_X();

        M m1 = new M();
        m1.print_M();
        m1.print_X();
    }

}