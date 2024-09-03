package MultilevelInheritance;

public class Test3 {
    void show(){
        String a = "Infosys";
        System.out.println("Company name is "+a);
    }
}
class df extends Test3{
    void te() {
        int s = 30000;
        System.out.println("salary is " + s);
    }
}
class de extends df{
    void rt(){
        int id = 123213;
        System.out.println("id is "+id);
    }
    public static void main (String[] args){
        de d1 = new de();
        d1.show();
        d1.te();
        d1.rt();
    }
}

