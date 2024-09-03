package Abs;

abstract class Test6 {
   abstract void climb();
}
class display3 extends Test6{
    void climb(){
        System.out.println("climbing tree");
    }
}

class display4 extends Test6{
    void climb(){
        System.out.println("climbing mountain");

    }
}

class test3{
    public static void main(String[] args){
        display3 d3 = new display3();
        d3.climb();

        display4 d4 = new display4();
        d4.climb();

    }
    }