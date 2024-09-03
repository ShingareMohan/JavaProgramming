package PackageInheritance;

public class Test1 {
    void add() {
        int a = 657;
        int b = 1287;
        int sum = a + b;
        System.out.println("Sum of two numbers is " + sum);
    }
}
    class child extends Test1{
        public static void main(String[] args) {
            child obj = new child();
            obj.add();
        }
    }

