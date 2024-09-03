package OverridingPack;

public class Override {
    int add;
    public int show(int a, int b){
        add = a+b;
        System.out.println("addition is"+add);
        return add;
    }
}
class abc extends Override{
    int sub;
    public int show(int a, int b){
        sub = a-b;
     System.out.println("substraction is "+sub);
     return sub;
    }
}
class Test12{
  public static void main(String[] args){
      abc a1 = new abc();
      a1.show(4,2);
  }
}