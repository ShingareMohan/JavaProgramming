package HybridInheritance;

public class Test5 {
    void show1(){
        System.out.println("Tata Group");
    }

}
class a2 extends Test5{
  void show2(){
      System.out.println("Tata Motors belongs to Tata group");
  }
}
class a3 extends a2{
    void show(){
        System.out.println("Tata Safari belongs to Tata Motors");
    }
}
class a4 extends a2{
    void show4(){
        System.out.println("Tata tiago belongs to Tata Motors");
    }
}

class test7{
    public static void main (String[] args){
        a2 t6 = new a2();
        t6.show1();
        t6.show2();

        a3 g1 = new a3();
        g1.show();

        a4 y1 = new a4();
        y1.show4();
    }
}