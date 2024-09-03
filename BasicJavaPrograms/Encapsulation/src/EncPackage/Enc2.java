package EncPackage;

public class Enc2 {
    private int Id;
    private String name;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class test1{
    public static void main (String[] args){
        Enc2 e2 = new Enc2();
        e2.setId(23211);
        System.out.println(e2.getId());
        e2.setName("java");
        System.out.println(e2.getName());
    }

    }