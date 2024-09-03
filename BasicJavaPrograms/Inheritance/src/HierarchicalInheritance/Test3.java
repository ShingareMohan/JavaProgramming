package HierarchicalInheritance;

public class Test3 {
}
class p{
    void print_p(){
        System.out.println("Company is xyz");
    }
}
class q extends p {
    void print_q(){
        System.out.println("Employee Id id: 123432");
    }
}
class r extends p{
    void print_r(){
        System.out.println("Employee Id id: 125477");
    }
}
class tuv{
    public static void main (String[] args){
        q obj1 = new q();
        obj1.print_p();
        obj1.print_q();


        r obj2 = new r();
        obj2.print_p();
        obj2.print_r();
    }
}
