package Abs;

abstract class Test5 {
    abstract void play();
}
class display1 extends Test5{
    void play(){
      System.out.println("Playing cricket");
    }
}

class display2 extends Test5{
    void play(){
        System.out.println("Playing football");
    }
}

class test2{
    public static void main(String[] args){
        display1 d1 = new display1();
        d1.play();

        display2 d2 = new display2();
        d2.play();
    }
    }