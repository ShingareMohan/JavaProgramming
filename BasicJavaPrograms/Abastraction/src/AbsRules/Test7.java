package AbsRules;

abstract class Test7 {
    abstract void play();
}
abstract class aa extends Test7{
    abstract void jump();
}
abstract class pp extends aa{
    void paly(){
        System.out.println("play method implimented");
    }

    @Override
    void jump() {
        System.out.println("jump method implimented");

    }
}
