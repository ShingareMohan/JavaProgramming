package HybridInheritance;

public class Test4 {
    void show(){
        System.out.println("GGParent");
    }
}
class g1 extends Test4{
    void show1(){
        System.out.println("Gparent");
    }
}
class g2 extends g1{
    void show2(){
        System.out.println("Parent");
    }
}
class g3 extends g2{
    void show3(){
        System.out.println("Child1");
    }
}

class g4 extends g2{
    void show4(){
        System.out.println("Child2");
    }

}

class test4{
    public static void main (String[] args){
    g2 obj1 = new g2();
    obj1.show();
    obj1.show1();
    obj1.show2();

    g3 k1 = new g3();
    k1.show3();

    g4 y1 = new g4();
    y1.show4();
    }
}