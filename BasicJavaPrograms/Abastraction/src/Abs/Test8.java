package Abs;

abstract class Test8 {
    abstract void learn();
}

class ksjdj extends Test8{
    @Override
    void learn() {
        System.out.println("Learning java programming");
    }
}

class efg extends Test8{
    @Override
    void learn() {
        System.out.println("Learning c# programming");
    }
}

class test8{
    public static void main(String[] args){
        ksjdj s4 = new ksjdj();
        s4.learn();

        efg j1 = new efg();
        j1.learn();
    }
}