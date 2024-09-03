package HybridInheritance;

public class Test1 {
    void show1(){
      System.out.println("Great grand parents have 2 acre farm");
    }
}
class s extends Test1{
    void show29(){
        System.out.println("Grand parents have 4 acres farm");
    }
}
class g extends s{
    void show3(){
        System.out.println("parents have 6 acres farm");
    }
}
class e extends s{
    void show4(){
        System.out.println("children1 will get 3 acre of land ");
    }
}
class w extends s{
    void show5(){
        System.out.println("children2 will get 3 acre of land");

    }
}
class test{
    public static void main (String[] args){
        g h1 = new g();
        h1.show3();

        e a1 = new e();
        a1.show4();

        w q1 = new w();
        q1.show5();
    }
}

