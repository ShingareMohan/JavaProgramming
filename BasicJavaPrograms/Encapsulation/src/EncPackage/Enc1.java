package EncPackage;

public class Enc1 {
    private int age;
    private String name = "Java";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class test{
    public static void main (String[] args){
        Enc1 e1 = new Enc1();
        e1.setAge(27);
        System.out.println(e1.getAge());
        e1.setName("Java");
        System.out.println(e1.getName());
    }
}