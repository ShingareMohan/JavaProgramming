package MultilevelInheritance;

public class Test4 {
    void go(){
        String a = "Hello";
        System.out.println(a);
    }
}
class az extends Test4{
    void show(){
        String d = "how are";
        System.out.println(d);
    }
}
class rt extends az{
    void view(){
        String f = "you";
        System.out.println(f);
    }
    public static void main (String[] args){
        rt r1 = new rt();
        r1.go();
        r1.show();
        r1.view();
    }
}
