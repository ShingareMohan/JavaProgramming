package HybridInheritance;

public class Test2 {
    void show1(){
        System.out.println("Company xyz have HR department");
    }
}
class a extends Test2{
    void show2(){
        System.out.println("Company xyz have Finance department");
    }
}
class b extends a{
    void show3(){
        System.out.println("Company xyz have CCD department");
    }

}
class t extends a{
    void show4(){
        System.out.println("employee A belongs to Finance department");
    }
}
class j extends a{
    void show5(){
        System.out.println("employee B belongs to Finance department");
    }

}
class testgt{

    public static void main (String[] args){
        b q1 = new b();
        q1.show1();
        q1.show2();
        q1.show3();

        t e1 = new t();

        e1.show4();

        j t1 = new j();

        t1.show5();
    }
}