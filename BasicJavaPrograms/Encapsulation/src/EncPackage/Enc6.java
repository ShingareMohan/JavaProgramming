package EncPackage;

public class Enc6 {
    private int age;
    private int Id;
    private double salary;
    private String Address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Enc6(int age, int id, double salary, String address) {
        this.age = age;
        Id = id;
        this.salary = salary;
        Address = address;
    }
}

class Test47{
    public static void main(String[] args){
        Enc6 e6 = new Enc6(28,3526,90000,"abc");
        System.out.println(e6.getAge());
        System.out.println(e6.getId());
        System.out.println(e6.getSalary());
        System.out.println(e6.getAddress());

    }
}