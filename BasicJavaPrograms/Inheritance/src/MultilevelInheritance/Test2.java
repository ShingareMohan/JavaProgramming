package MultilevelInheritance;

public class Test2 {
    void abc(){
        String a = "How are you";
        System.out.println(a);
    }
}
class xyz extends Test2{
    void sjhh(){
        String s = "Where do you live";
        System.out.println(s);
    }
}
class tell extends xyz{
    void show(){
        String d = "What is your profession";
        System.out.println(d);
    }
}
class ex extends tell{
    void go(){
        String f = "Nice to meet you";
        System.out.println(f);
    }
    public static void main (String[] args){
        ex e1 = new ex();
        e1.abc();
        e1.sjhh();
        e1.show();
        e1.go();
    }
}
