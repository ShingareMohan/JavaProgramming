package HybridInheritance;



public class Test3 {
    void show(){
        System.out.println("GGParent");
    }
}
class g11 extends Test3{
    void show1(){
        System.out.println("Gparent");
    }
}
class g12 extends g11{
    void show2(){
        System.out.println("Parent");
    }
}
class g13 extends g12{
    void show3(){
        System.out.println("Child1");
    }
}

class g14 extends g12{
    void show4(){
        System.out.println("Child2");
    }

}

class test15{
    public static void main (String[] args){
        g12 obj1 = new g12();
        obj1.show();
        obj1.show1();
        obj1.show2();

        g13 k1 = new g13();
        k1.show3();
       
        g14 y1 = new g14();
        y1.show4();
    }
}