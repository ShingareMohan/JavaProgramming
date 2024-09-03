public class this1 {
    int i;
    void setvalue(int i){
this.i= i;
    }
    void show(){
        System.out.println(i);
    }
}
class xyz{
    public static void main (String[] args){
        this1 t1 = new this1();
        t1.setvalue(10);
        t1.show();
    }
}