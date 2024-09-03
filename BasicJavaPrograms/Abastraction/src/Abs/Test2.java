package Abs;

abstract class Test2 {
    abstract void drink();
}
class abc extends Test2{
    void drink(){
        System.out.println("Drinking water");
    }
}

class xyz extends Test2{
    void drink(){
        System.out.println("Drinking cold drink");
    }
}
class b1{
    public static void main(String[] args){
      abc q1 = new abc();
      q1.drink();

      xyz r1 = new xyz();
      r1.drink();
    }
}