package AbsRules1;

abstract class Rule3 {
    abstract void run();
}
abstract class r11 extends Rule3{
    abstract void display();
}
 class j11 extends r11{

     @Override
     void run() {

     }

     @Override
     void display() {

     }
 }
 class test2{
    public static void main (String[] args){
        r11 ss = new j11();
        ss.run();
        ss.display();

    }
 }