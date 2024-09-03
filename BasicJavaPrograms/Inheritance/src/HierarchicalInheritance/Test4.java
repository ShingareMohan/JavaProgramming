package HierarchicalInheritance;

public class Test4 {
}
class dedf{
    void print_dedf(){
        System.out.println("Department is ETC");
    }
}
class fjgh extends dedf{
    void print_fjgh(){
        System.out.println("Student Id: 23211");
    }
}
class fjhf extends dedf{
    void print_fjhf(){
        System.out.println("Student Id: 23212");
    }
}
class hfyr{
    public static void main (String[] args) {
        fjgh g1 = new fjgh();
        g1.print_dedf();
        g1.print_fjgh();

        fjhf d1 = new fjhf();
        d1.print_dedf();
        d1.print_fjhf();
    }
}