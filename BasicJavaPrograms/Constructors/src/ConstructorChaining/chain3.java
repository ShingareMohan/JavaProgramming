package ConstructorChaining;

public class chain3 {
    public chain3(){
        System.out.println("First constructor");
    }
}
class abc extends chain3{
    public abc(){
        System.out.println("Second constructor");
    }
}
class djf extends abc{
    public djf(int a){
        System.out.println("third constructor");
    }
}
class review3{
    public static void main(String[] args) {
        djf j1 = new djf(2);
    }

    }