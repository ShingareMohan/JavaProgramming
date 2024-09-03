package Abs;

abstract class Test4 {
    abstract void eat();
}
class demo1 extends Test4{
    void eat(){
        System.out.println("eating maggie");
    }
}

class demo2 extends Test4{
    void eat(){
        System.out.println("eating apple");
    }
}

class view{
    public static void main(String[] args){
        demo1 l1 = new demo1();
        l1.eat();

        demo2 s1 = new demo2();
        s1.eat();
    }
}