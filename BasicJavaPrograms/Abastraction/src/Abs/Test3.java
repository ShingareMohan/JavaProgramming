package Abs;

abstract class Test3 {
    abstract void write();
}
class abc1 extends Test3{
    void write(){
        System.out.println("Writing letter");
    }
}
class xyz1 extends Test3{
    void write(){
        System.out.println("Writing essay");
    }
}
class test{
    public static void main(String[] args){
        abc1 t1 = new abc1();
        t1.write();

        xyz1 j1 = new xyz1();
        j1.write();
    }
}