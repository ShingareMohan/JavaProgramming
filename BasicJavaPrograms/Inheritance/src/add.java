public class add {
  int a;
  int b;
  int c;
  void add(int a, int b){
      this.a=a;
      this.b=b;
      c = a+b;
      System.out.println(c);

  }
  void display(){
      System.out.println(a+""+b);



  }
}
class a11 {
    public static void main(String[] args) {
add i1 = new add();
i1.add(2,5);

    }
}
