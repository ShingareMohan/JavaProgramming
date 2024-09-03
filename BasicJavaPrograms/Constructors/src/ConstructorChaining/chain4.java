package ConstructorChaining;

public class chain4 {
    public chain4(int d){
        System.out.println("constructor1");
    }
}
class hgr extends chain4{
    public hgr(){
        super(10);
        System.out.println("constructor2");
    }
}
class rte extends hgr{
    public rte(){
        System.out.println("constructor3");
    }
}
class review4{
    public static void main(String[] args) {
rte t1 = new rte();
    }
    }