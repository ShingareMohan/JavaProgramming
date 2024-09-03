package AbsPack;

abstract class  Abs1 {
   abstract void show();

   public void test(){
       System.out.println("Non abstract method");
   }
}

class A extends Abs1{

    @Override
    void show() {
        System.out.println("Abstract method");
    }
}
class Test26{
    public static void main(String[] args){
        A a1 = new A();//Created child class object
        a1.show();
        a1.test();
    }
}