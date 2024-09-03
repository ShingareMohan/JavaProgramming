package HierarchicalInheritance;

public class Test5 {
}
class efg{
    void print_efg(){
        System.out.println("University is SRTMUN");
    }
}
class bcd extends efg{
    void print_bcd(){
        System.out.println("College is MGM");
    }
}
class ijk extends efg{
    void print_ijk(){
        System.out.println("college is SGGS");
    }
}
class lmn{
    public static void main (String[] args){
        bcd b1 = new bcd();
        b1.print_efg();
        b1.print_bcd();

        ijk j1 = new ijk();
        j1.print_efg();
        j1.print_ijk();
    }
}