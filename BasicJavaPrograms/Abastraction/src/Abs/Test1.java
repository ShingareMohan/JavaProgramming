package Abs;

abstract class Test1 {
    abstract void go();

}
class display extends Test1{
  void go(){
      System.out.println("Going to Indian city Delhi");
  }
}
class go1 extends Test1{
    void go(){
        System.out.println("Going to American city LA");
    }

}
class demo{
    public static void main(String[] args){
    display d1 = new display();
    d1.go();

    go1 g1 = new go1();
    g1.go();
    }
}