package MultilevelInheritance;

public class Test5 {
    void show(){
        String city = "Degloor";
        System.out.println("City is "+city);
    }
}
class gt extends Test5{
    void go(){
        String District = "Nanded";
        System.out.println("district is "+District);
    }
}
class ty extends gt{
    void kf(){
        String State = "Maharashtra";
        System.out.println("State is "+State);
    }
    public static void main (String[] args){
        ty t1 = new ty();
        t1.show();
        t1.go();
        t1.kf();
    }
}
